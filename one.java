import java.util.Scanner;

public class one 
{

    public static void main(String[] args) 
    {
        
        
        Scanner babe = new Scanner(System.in);

        System.out.println("Enter your name");
        String str = babe.nextLine();

        System.out.println( "Your name is "+str );

        babe.close();
    }
}