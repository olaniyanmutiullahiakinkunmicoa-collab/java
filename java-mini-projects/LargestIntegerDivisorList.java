public class LargestIntegerDivisorList
{
    
     static int divisorArrayIndex;
     static int[] divisorCountArray = new  int[10001];
    
     static int maxDivisorCount = 1;
     static int integer ;
     static int integerWithLargestDivisor = 1; 
     static int divisorCount; 
     static int testDivisor;
     public static void largestDivisor()
     {
         // first loop determines the number (multiple)


         divisorArrayIndex = 0;

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
                //storing each count in array;
            divisorCountArray[integer] = divisorCount;

                

                if ( divisorCount > maxDivisorCount )
                {
                  maxDivisorCount = divisorCount;
                  integerWithLargestDivisor = integer;
            
                }
                   
         }
            
         System.out.printf("Among integers between 1 and 10000,The maximum number of divisors was %d%n", maxDivisorCount );
         //To print out number max divisor;
         System.out.println("Numbers with that many divisors include:");

        for( integer = 2;  integer <= 10000; ++integer )
        {
            if(divisorCountArray[integer] == maxDivisorCount)
            {

                System.out.println( " " + integer);
     
            }
        }
         

          
      }

     public static void main (String [] args)
     {

          largestDivisor();

     }
 }






