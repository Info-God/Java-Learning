
/*
 * Day 1
 * Question: What is the score in a game?
    – If the score is less than 50, print "You need
    to improve."
    - If the score is between 50 and 70
    (inclusive), print "Good job!"
    - If the score is greater than 70, print
    "Excellent performance!"
 */

import java.util.Scanner;

public class score {

    public static void main(String[] args) {

        int score;
        Scanner inputVar = new Scanner(System.in);

        System.out.println("Enter Score");

        score = inputVar.nextInt();

        if(score < 50)
            System.out.println("You need to improve");

        else if(score > 50 && score < 70)
            System.out.println("Good job");
        
        else if(score > 70)
            System.out.println("Excellent performance");
    }

}
