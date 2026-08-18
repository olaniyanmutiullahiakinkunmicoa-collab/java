public class DieRollForSnakeEye
{
    
    public static  int SnakeEye()

    {
        // die rolling
        int count = 0;
        while(true)
        {
            
            int die1 = (int) (6*Math.random()+1);
            int die2 = (int) (6*Math.random()+1);
            count++;

        // condition for snake eye(both dice show one)
            if (die1 == 1 && die2 == 1)
            {
                break;
            } 
        }
        return  (count);
    }

    public static void main (String [] args)
    {
        int countTimes = SnakeEye();
        System.out.printf("The number of roll for snake  eyes is %d%n", countTimes  );
    
    }

}
