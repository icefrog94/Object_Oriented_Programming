/*
 * Copyright (C) 2014 Allen Garvey
 * 
 * allengarvey.com
 * Destroy after reading!
 * 
 */

package jtasklistmanager;

import java.sql.SQLException;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DatabaseManager db = new DatabaseManager();
        System.out.println(db.getResultSetLength());
    }
    
}
