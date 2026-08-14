 //program that simulates rolling a pair of dice,rolling twice.

public class DieRoll
{
    public static void main (String [] args )

    {
        int firstRoll  = (int)(6*Math.random())+1 ;
        int secondRoll = (int)(6*Math.random())+1 ;
        int totalSum   =  firstRoll + secondRoll;
        
        System.out.printf ("The first roll is: %d%n",firstRoll);
        System.out.printf ("The second roll is %d%n",secondRoll); 
        System.out.printf ("The total roll is %d%n",totalSum);
        
    }

}
