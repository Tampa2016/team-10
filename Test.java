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
public class Test {
    public static void main(String[] args){
        // Create 5 questions
        String i1, i2, i3, i4, i5;
        i1 = "On a scale from 1 to 5, how would you rate your overall service?";
        i2 = "Were the bathrooms to your satisfaction? 'y' or 'n'";
        i3 = "Did you have a hard time getting INTO the establishment? 'y' or 'n'";
        i4 = "Did you have a hard time getting service once you were INSIDE the establishment? 'y' or 'n'";
        i5 = "Did you have a hard time getting TO the establishment? 'y' or 'n'";
        String allInquiries[] = {i1, i2, i3, i4, i5};
        // Test list of inquiries
        for (int i=0; i < 5; i++){
            System.out.printf("%s%n", allInquiries[i]);
        }
        // Create 5 questions
        Question q1 = new Question(i1);
        Question q2 = new Question(i2);
        Question q3 = new Question(i3);
        Question q4 = new Question(i4);
        Question q5 = new Question(i5);
        // Put questions into array
        Question allQuestions[] = {q1, q2, q3, q4, q5};
        // Create a review
        Review r1 = new Review(5);
        // Add test results (1:5) for first (0 || 1) for second
        int allResults[] = {3, 1, 0, 1, 0};
        for (int i=0; i < 5; i++){
            r1.addResultsArray(allResults);
        }
        
        
        
        
    }

    
}
