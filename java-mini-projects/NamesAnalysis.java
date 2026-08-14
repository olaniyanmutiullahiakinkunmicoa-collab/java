//analysing names

import  java.util.Scanner;

public class NamesAnalysis {

    public static void main(String [] args)

    {
        
        Scanner stdin = new Scanner(System.in);
        System.out.print("Please enter your first name and last name, separated by a space: ");
        String names = stdin.nextLine(); // user input
        
        int spaceIndex = names.indexOf(" ");  //space index

        String firstName = names.substring(0, spaceIndex);  //fistname
        String lastName  = names.substring(spaceIndex + 1);    //lastname

        int firstNameCharNumber =  firstName.length();   //character number of first name
        int lastNameCharNumber  =  lastName.length();    // second name character number
        
        char firstNameInitial = firstName.charAt(0);    // first name initial
        char lastNameInitial = lastName.charAt(0);

        //to capitalize the initials to avoid lowwer case initials

         char firstNameCapInitial = Character.toUpperCase(firstNameInitial);
         char lastNameCapInitial  = Character.toUpperCase(lastNameInitial);
                    
        System.out.printf("""

                            Your first name is %s, which has %s characters
                            Your last name is %s, which has %s  characters
                            Your initials are %s%s


                            """,
                            
                            firstName,
                            firstNameCharNumber, 
                            lastName,
                            lastNameCharNumber,
                            firstNameCapInitial,
                            lastNameCapInitial );    
    

     }

}
