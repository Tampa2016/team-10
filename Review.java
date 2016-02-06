<<<<<<< HEAD
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
public class Review {
    private int questionResults[];
    private Question questionList[];
    
    public Review(){
        
    }
    public Review(int numQuestions){
        questionResults = new int[numQuestions];
        questionList = new Question[numQuestions];
    }
    
    public int getQuestionResult(int index){
        return questionResults[index];
    }
    public void addResults(int rNum, int index){
        questionResults[index] = rNum;
    }
    public void addResultsArray(int[] rArray){
        for (int i=0; i < rArray.length; i++){
            questionResults[i] = rArray[i];
        }
    }
    
=======
import java.util.ArrayList;


public class Review {
	

>>>>>>> origin/master
}
