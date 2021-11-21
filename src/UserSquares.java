import java.util.Scanner;
import javax.swing.JOptionPane;

/**
This program demonstrates a user controlled for loop.
*/

public class UserSquares
{
   public static void main(String[] args)
   {
      int number; // Loop control variable
      String inStr;
      int maxValue; // Maximum value to display
      
      JOptionPane.showInputDialog("I will display a table of " + 
      "numbers and their squares.");
      
      
      
      // Get the maximum value to display.
     inStr = JOptionPane.showInputDialog("How high should I go?");
      maxValue = Integer.parseInt(inStr);
      
      
      
      for (number =1; number <= maxValue; number++)
      {
         // Display the table
      JOptionPane.showMessageDialog(null, "Number Number Squared\n ---------------------\n"+ number + "\t\t");
         }
    }
}         