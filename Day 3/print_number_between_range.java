import java.util.*;

public class print_number_between_range {
    public static void main(String[] args) {
        Scanner inputField = new Scanner(System.in);

        System.out.print("Enter range 1:");

        int range1 = inputField.nextInt();

        System.out.print("Enter range 2:");

        int range2 = inputField.nextInt();
        int count = 0;
        for(int i = 1; range1 <= range2; i++){
            if(range1 % 2 != 0)
                count +=1;
                
            
            range1 += 1;
        }
        System.out.println(count);
    }
}
