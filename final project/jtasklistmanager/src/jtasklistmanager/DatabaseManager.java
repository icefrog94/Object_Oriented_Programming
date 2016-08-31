/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jtasklistmanager;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.derby.jdbc.*;

public class DatabaseManager {
    private Connection con;
    private Statement stmt;
    private ResultSet resultSet;
    private String dbURI = "jdbc:derby:tasklistmanager;create=true";
    
    int taskNameFieldLimit;
    int pathNameFieldLimit;
    String systemDir;
    

    public DatabaseManager() {
        this.taskNameFieldLimit = 240;
        this.pathNameFieldLimit = 100;
        setDBSystemDir();
        createDBTable();
        resetResult();
    }

    private void setDBSystemDir(){
        String userHomeDir = System.getProperty("user.home");
        systemDir = userHomeDir + "/documents/jtasklistmanager/";
        System.setProperty("derby.system.home", systemDir);
        
    }

    private void createDBTable(){
        try{
            DriverManager.registerDriver(new EmbeddedDriver());
            con = DriverManager.getConnection(dbURI);
            String sql = "create table tasklists(name varchar(" + taskNameFieldLimit + "), path varchar(" + pathNameFieldLimit + 
                        ")" + ")";
            stmt = con.createStatement();
            stmt.execute(sql);
        }
        catch(SQLException ex){
            if(ex.getErrorCode() != 30000){ //ie table already exists
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
    
    public void resetResult(){
        try{
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = stmt.executeQuery("select * from tasklists");
            resultSet.first();
        
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    
    public String[] getCurrentContents(){
        String[] contents = new String[2];
        try{
            contents[0] = resultSet.getString("name");
            contents[1] = resultSet.getString("path");
        
        }
        catch(SQLException ex){
            if(ex.getErrorCode() == 20000){ //no records in table
                for(int i=0;i<2;i++){
                    contents[i] = "";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return contents;
    }

    public ResultSet getResultSet() {
        resetResult();
        return resultSet;
    }
    
    public void nextResult() throws SQLException{
        if(resultSet.next()){
            
        }
        
    }
    
    public void previousResult() throws SQLException{
        if(resultSet.previous()){
            
        }
    }
    
    public void lastResult() throws SQLException{
        resultSet.last();
    }
    
    public void firstResult() throws SQLException{
        resultSet.first();
    }
    
    public void insertIntoDatabase(String[] values)  throws SQLException{
            String name = values[0];
            String path = values[1];
            
            String sql = "insert into tasklists values ('" + name + "','" + path + "')";
            stmt.executeUpdate(sql);
    }
    
    public void updateDatabase(String[] values) throws SQLException{
        String name = values[0];
        String path = values[1];


        resultSet.updateString("name", name);
        resultSet.updateString("path", path);

        resultSet.updateRow();
        con.commit();
        
    }
    
    public void deleteFromDatabase(TaskList tl) throws SQLException{
        String sql = "delete from tasklists where path = '" +  tl.getPath() + "'";
        stmt.execute(sql);
    }

    public int getNameFieldLimit() {
        return taskNameFieldLimit;
    }

    public int getEmailFieldLimit() {
        return pathNameFieldLimit;
    }

    
    public int getResultSetLength() throws SQLException{
        int currentRow;
        
        int length = 0;
        boolean b;
        
        currentRow = resultSet.getRow();
        b = resultSet.last();
        if(b){
            length = resultSet.getRow();
            resultSet.absolute(currentRow);
        }
        return length;
    }

    public String getSystemDir() {
        return systemDir;
    }
    
    





    
    
    
    
    
    
    
   
    
    
}

