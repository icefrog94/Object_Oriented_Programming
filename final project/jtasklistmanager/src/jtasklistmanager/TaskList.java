/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jtasklistmanager;

import java.io.Serializable;
import java.util.ArrayList;


public class TaskList implements Serializable{
    private ArrayList<Task> taskList;
    private String path;
    private String title;
    private boolean saved;

    public TaskList(ArrayList<Task> taskList, String title, String path) {
        this.taskList = taskList;
        this.path = path;
        this.title = title;
        this.saved = false;
    }

    public TaskList(String title, String path) {
        this.title = title;
        this.path = path;
        taskList = new ArrayList();
        this.saved = false;
    }


    public TaskList() {
        taskList = new ArrayList();
        this.saved = false;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }
    
    public Task get(int index){
        return taskList.get(index);
    }
    
    public int getLength(){
        return taskList.size();
    }
    
    public void addTask(Task task){
        taskList.add(task);
    }
    
    public void deleteTask(int index){
        taskList.remove(index);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }
    
    
    
    
    
}
