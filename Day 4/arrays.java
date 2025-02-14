/*
 * Get input for 5 Numbers using Array
    and for loop
 */
import java.util.Scanner;
public class arrays {
    public static void main(String args[]){
        try(Scanner inputObject = new Scanner(System.in)){
            System.out.println("Enter the number of subjects");
            int subjectsCount = inputObject.nextInt();
    
            int[] marks = new int[subjectsCount];
    
            for(int i=0;i<subjectsCount;i++){
                System.out.println("Enter the mark for subject " + (i+1));
                marks[i] = inputObject.nextInt();
            }
    
            for(int j=0;j<marks.length;j++){
                System.out.println("mark for subject " + (j+1) + "is "+ marks[j]);
            }
        }

    }
}
