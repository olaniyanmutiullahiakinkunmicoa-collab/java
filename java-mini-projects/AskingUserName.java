import java.util.Scanner;

public  class AskingUserName
{

    public static void main( String[] args)
    {
        //String name;
        Scanner stdin = new Scanner (System.in);
        System.out.print("Hi, what's your name: ");
        String name = stdin.nextLine();
        String uppercaseName= name.toUpperCase();

        System.out.printf("Hello, %s, nice to meet you!%n", uppercaseName);
        
        
    }

}
