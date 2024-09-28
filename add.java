import java.util.Scanner;

public class Main {  // Class name should start with an uppercase letter
    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);  // Semicolon was missing

        System.out.println("Enter First Number: ");  // Corrected the print statement
        int a = add.nextInt();

        System.out.println("Enter Second Number: ");  // Corrected the print statement
        int b = add.nextInt();

        int Sum = a + b;  // Fixed the addition syntax
        System.out.println("Sum of two numbers is " + Sum);  // Corrected the output statement
    
        add.close();
    }
}
