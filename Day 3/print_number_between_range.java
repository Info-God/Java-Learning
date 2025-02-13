import java.util.*;

public class print_number_between_range {
    public static void main(String[] args) {
        Scanner inputField = new Scanner(System.in);

        System.out.print("Enter range 1:");

        int range1 = inputField.nextInt();

        System.out.print("Enter range 2:");

        int range2 = inputField.nextInt();

        for(int i = 1; range1 <= range2; i++){
            System.out.println(range1);
            range1 += 1;
        }

    }
}
