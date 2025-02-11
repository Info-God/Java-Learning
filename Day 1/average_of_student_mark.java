
/*
 * get input for five subjects marks. Add all of it,
    And find average. If
    average mark is less than 35. Print "Additional
    class is required" else
    Print "you are good to go"
 */

import java.util.Scanner;
public class average_of_student_mark {
    public static void main(String args[]){
        int subjects = 5;
        int i;
        int marks_count = 0;
        int average;
        Scanner inputVar = new Scanner(System.in);

        for(i=0;i<subjects;i++){
            System.out.print("Enter mark for subject " + i);
            marks_count += inputVar.nextInt();

        }
        average = marks_count / subjects;
        System.out.print((average < 35) ? "Additional class is required" : "You are good to go");

        
    }
}
