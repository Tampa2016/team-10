/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForGood;

/**
 *
 * @author Quentin Goss
 */
public class Question {
    private String inquiry;
    private int response;
    
    public Question(){
    }
    public Question(String pInquiry){
        inquiry = pInquiry;
    }
    
    public void setResponse(int newResponse){
        response = newResponse;
    }
    public void setInquiry(String newInquiry){
        inquiry = newInquiry;
    }
    
}
