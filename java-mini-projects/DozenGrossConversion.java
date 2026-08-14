
//converting to  dozen and gross
import java.util.Scanner;

public class DozenGrossConversion{

    public static void main (String [] args)

    {
        
        Scanner stdin = new Scanner(System.in);
        System.out.print("How many eggs do you have: ");
        long eggs = stdin.nextLong();            //user input

        long gross = eggs / 144;               // Gross
        long grossLeftOver = eggs % 144;       // left over for gross
        long dozen = grossLeftOver / 12;       //Dozen
        long remainingEggs = grossLeftOver % 12;       //remaining after gross and dozen


        System.out.printf("Your number of eggs is %s gross, %s dozen, and %s%n", gross,dozen,remainingEggs);       
        
        
    
    }





}
