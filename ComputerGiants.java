import java.util.*;
import java.util.Scanner;

public class ComputerGiants 
{
    public static void main(String [] args)
    {
        Map<String, String> names = new HashMap<String, String>();
        
        names.put("George Boole" , " Boolean Logic ");
        names.put("Augustus De Morgan", "DeMorgan Law");
        names.put("Claude Shannon" , "Theorize Logic");
        names.put("John Atanasoff" , "theorized digital computer ");
        names.put("John Mauchly",   "ENVIAC");
        names.put("Von Neumann" , "Computer architecture");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Who will you like to know about ");
        String  userInput = keyboard.nextLine();

        if(userInput.equals("George Boole"))
        {
            System.out.print(" George Boole is known for" + names.get("George Boole" ));
        }
        else if (userInput.equals( "Augustus De Morgan"))
        {
        
            System.out.print("Augustus De Morgan is known for " + names.get("Augustus De Morgan"));
        }
        else if (userInput.equals("Claude Shannon"))
        {
            System.out.println("Claude Shannon is known for " + names.get("Claude Shannon"));
        }
        else if(userInput.equals("John Atanasoff"))
        {
            System.out.println("John Atanasoff is know for " + names.get("John Atanasoff"));
        }
        else if(userInput.equals("John Mauchly"))
        {
            System.out.println("John Mauchly is known for " + names.get("John Mauchly"));
        }
        else if(userInput.equals("Von Neumann"))
        {
            System.out.println("Von Neumann is known for " +  names.get("Von Neumann"));
        }
       else
            System.out.println("Invalid Input Try Again...");

       


        keyboard.close();
    }
}
