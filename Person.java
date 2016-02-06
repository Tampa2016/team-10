/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package CodeForGood;

/**
 *
 * @author Quentin Goss
 */
public class Person {
    private int id;
    private String username;
    private String pass;
    
    public Person(){
        id = 1;
        username = "DEFAULT";
        pass = "PASSWORD";
    }
    public Person(int pID, String pUsername, String pPass){
        id = pID;
        username = pUsername;
        pass = pPass;
    }
    
    public int getID(){
        return id;
    }
    public void setID(int newID){
        id = newID;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String newUsername){
        username = newUsername;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String newPass){
        pass = newPass;
    }
}

