public class LargestIntegerDivisor
{   static int maxDivisorCount = 1; 
    static int integer ;
    static int integerWithLargestDivisor = 1; ;
    static int divisorCount ;
    static int testDivisor;  
    public static void largestDivisor()
    {
        // first loop determine the number (multiple)
         
               
        
        for (integer  = 2; integer  <= 10000;  ++integer  )
        {
             divisorCount = 0;

            for (testDivisor = 1 ; testDivisor <= integer; ++testDivisor )

            {

                if(integer % testDivisor ==  0 )
                
                {      
                    divisorCount++;

                }
                
            }
            if (divisorCount >  maxDivisorCount)
            {
                 maxDivisorCount =  divisorCount;
                 integerWithLargestDivisor = integer;
            }
        }
       
        System.out.printf(""" 
                           The  maximum divisorcount is %d.
                           The  integer with largest divisor is %d
                         """, maxDivisorCount, integerWithLargestDivisor);
    }

    public static void main (String [] args)
    {
        
         largestDivisor();

    }
}


