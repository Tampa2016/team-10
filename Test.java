/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForGood;
import java.security.SecureRandom;
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
        //__Test Locations__
        // Create 9 test locations
        Location l1 = new Location("Subway","Sandwhich Shop",863,4225439,
                "subway.com","Haines City","Florida","1013 E Hinson Ave",33844);
        Location l2 = new Location("La Parcela","Mexican Resturant",863,4190569,
                "N/A","Haines City","Florida","15 S 10th St", 33844);
        Location l3 = new Location("Kangaroo Express","Convience Store",863,
                4225439,"kangarooexpress.com","Haines City","Florida",
                "1013 E Hinson Avenue",33844);
        Location l4 = new Location("Bank of America","Bank",863,4221124,
                "locators.bankofamerica.com","Haines City","Florida",
                "905 E Hinson Ave",33844);
        Location l5 = new Location("Advance Auto Parts","Auto Parts Store",863,
                4214061,"stores.advanceautoparts.com","Haines City","Florida",
                "1015 E Hinson Ave",33844);
        Location l6 = new Location("Landmark Baptist College","College",863,
                4226493,"landmarkbaptistcollege.com","Haines City","Florida",
                "810 E Hinson Ave",33844);
        Location l7 = new Location("Palm Krest Manor Assisted",
                "Assisted Living Facility",863,4223567,"N/A","Haines City",
                "Florida","20 S 10th St",33844);
        Location l8 = new Location("Lindvall Florist Inc.","Florist",863,
                4222541,"N/A","Haines City","Florida","29 N 10th St",33844);
        Location l9 = new Location("Natalie's Special Occasions boutique",
                "Boutique",863,3536117,"N/A","Haines City","Florida",
                "17 N 10th St",33844);
        //Put locations into list.
        Location nearbyPlaces[] = {l1,l2,l3,l4,l5,l6,l7,l8,l9};
        // @param trials reviews for each 5 questions
        int trials = 1000;
        // randomResults[question#][Results...]
        int randomResults[][] = new int[5][trials];
        for (int i = 0;i < trials;i++){
            SecureRandom randomNum = new SecureRandom();
            // Question 1 (1:5)
            randomResults[0][i] = randomNum.nextInt(6); 
            // Questions 2-5 ('y' or 'n')
            for (int j = 1; j <= 4; j++){
                randomResults[j][i] = randomNum.nextInt(2);
            }
        }
        // Sum up results
        int meanResults[] = new int[5];
        for (int i = 0; i < trials; i++){
            for (int j = 0; j < 5; j++){
                meanResults[j] += randomResults[j][i];
            }
        }
        // find mean of results
        meanResults[0] /= trials;
        for (int i = 0; i < 5; i++){
            //meanResults[i] /= trials;
            System.out.printf("%s%n", "Q" + i + ": " + meanResults[i]);
        }
    }
}
