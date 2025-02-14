import java.util.Scanner;
public class print_2_table {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter table you want to know");

        int tableNumber = inputObj.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(tableNumber + " x "+ i+ " =" + (tableNumber*i));
        }
    }
}
