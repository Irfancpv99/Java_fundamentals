import java.util.Scanner;

public class main {
    public static void main(String args[]) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter First Number /n");
        int a = add.nextInt();
        System.out.println("Enter Second Number /n");
        int b = add.nextInt();

        int Sum =  a +  b;
        System.out.println("Sum of two number is "+sum);
    
        add.close();
    }
}