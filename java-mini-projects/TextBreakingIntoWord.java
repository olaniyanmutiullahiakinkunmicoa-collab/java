import java.util.Scanner;

public class TextBreakingIntoWord
{
    public static void breakingText()
    {
        char character; 
        boolean letterTrue;
        boolean didCr; 
        //user input
        Scanner stdin  = new Scanner(System.in);
        System.out.println("Enter your sentence ");
        String userInput = stdin.nextLine();
        System.out.println();
        
        
       //
        for (int index = 0; index < userInput.length(); ++index)
        {
        
           character = userInput.charAt(index);

            letterTrue = Character.isLetter(character);
            if(letterTrue)
            {
               System.out.print(character);
               
            }
                      
                
             else
            {
                                
                System.out.println();
                    
            }
              
        }
        System.out.println(); 

    }   
    public static  void main(String[] args)
    {
        
         breakingText();
    }
}
