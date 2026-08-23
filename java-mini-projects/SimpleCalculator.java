import java.util.Scanner;

public class SimpleCalculator
{
   
    public void bodmasCalculator()
  {
        Scanner stdin = new Scanner (System.in);
        while(true)
        {   
            //first number input;         
            double firstNumberInput;         
            System.out.println("Enter  a number: ");
           
            try
            {
                firstNumberInput = stdin.nextDouble();
       
        
                if (firstNumberInput ==  0)
                {
                    return; 
                }
            }
            catch( Exception e) 
            {
    
                System.out.println("Enter number not letter or character");
                stdin.next();
                continue;
            }
            
             //  operator input;
                System.out.println("Enter  an allowed operator ( +, -, *, /) ");
            
                
              char  operatorInput = stdin.next().charAt(0);

            if(operatorInput != '+'   && operatorInput != '-'  && operatorInput != '*'  && operatorInput != '/' )

             {
                 System.out.println("Enter  an allowed operator ( +, -, *, /)     ");           
                 
                 continue;
        
             }
        
            //second number input
             double secondNumberInput;        
            
            try
            {
                System.out.println("Enter  another number: ");
             
                secondNumberInput = stdin.nextDouble();
            }

            catch ( Exception e) 
            {
                System.out.println("Enter number not letter or character");
                stdin.next();
                continue;
            }
             //Evaluation

            switch(operatorInput)
            {
                case '+': 

                double sum = firstNumberInput +  secondNumberInput ;
                System.out.println("The result : " + sum);
                break;
            
                case '-' :
                double sub = firstNumberInput -  secondNumberInput ;                                                                
                System.out.println("The result : " + sub);
                break;

                case '*' :
                double mult = firstNumberInput *  secondNumberInput ;
                System.out.println("The result : " + mult);
                break;

                case '/' :

                double div =  firstNumberInput / secondNumberInput ; 
                System.out.println("The result : " + div);
                break;

                default:
                System.out.println("The calculator only allows \'+, -, *, /\'" );
                continue;
          }

             
      }
           

    }
    
    public static void main (String[] args) 
    { 
        SimpleCalculator NewCalculator = new  SimpleCalculator();

         NewCalculator.bodmasCalculator();  

        


   }

}
