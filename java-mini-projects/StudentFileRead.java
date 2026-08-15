import textio.TextIO;

/*
*   program to read from student data file
*
*/

public class StudentFileRead  {

    public static void main(String[] args)
    {
        //user input  from file
        
        TextIO.readFile("testdata.txt"); 

        // name input  from file
        String StudentNames = TextIO.getln();

        //score input
        double exam1 = TextIO.getlnDouble();
        double exam2 = TextIO.getlnDouble();
        double exam3 = TextIO.getlnDouble();

        //average score
        double average = ( exam1 + exam2 + exam3) / 3 ;

       //printint out the name and average
 
       System.out.printf("""
                                            
                                The names of the  student are %s.
                                the student’s average grade is %1.3f.
                        
                        %n""",
                                 StudentNames,
                                 average 
                        );
   
     }



}
