import javax.swing.JOptionPane; //Imports the JOptionPane utility.

import java.text.DecimalFormat; // Imports decimal format.

/**
This program is used to calculate the cost for
comparing telephone company services and determining 
the cheapest rate.
*/

public class PhoneCharges2
{
   public static void main(String[] args)
   {
      
      String inputString; // For reading input
      double minutes; // The amount of minutes
      double texts; // The amount of texts
      double total; // The total monthly cost
      double ABC; // Defines number of free minutes for ABC
      double Horizon; // Defines number of free minutes for Horizon
      double Tint; // Defines number of free minutes for Tint
      
      
      
      DecimalFormat dec = new DecimalFormat("0.00"); //sets output for two decimal places
               
      
      // Ask the user for the number of minutes.
      inputString = JOptionPane.showInputDialog("How many minutes" + 
      " will you use?");
      
      // Convert the input to a double.
      minutes = Double.parseDouble(inputString);
      
      ABC = minutes-100; // Sets variable ABC and condition for output
      Horizon = minutes-200; // Sets variable Horizon and condition for output
      Tint = minutes-400; // Sets variable Tint and condition for output
      
      if (minutes < 100) // if statement for user input
      {
      ABC = 0;
      Horizon = 0;
      Tint = 0;
      }
      else if (minutes >=100 && minutes <200) // sets conditions for else if statement
      {
      Horizon = 0;
      Tint = 0;
      }
      else if (minutes >=200 && minutes <400) // sets conditions for else if statement
      {
      Tint = 0;
      }
       /**
        User input is asked for before defining variables,
        so if statements will override variable
        definitions.
        */
      
      
      // Ask the user for the number of texts
      inputString = JOptionPane.showInputDialog("How many texts " + 
      "will you use?");
      
      // Convert the input to a double.
      texts = Double.parseDouble(inputString);
      
      // Calculate the total monthly cost and output
      JOptionPane.showMessageDialog(null,"Your monthly cost with AB&C is $" + dec.format(((ABC*.03) + (texts * .05) + 5)) + 
      "\nYour monthly cost with Horizon is $" + dec.format((Horizon *.05) + (texts * .03) + 10)
      + "\nYour monthly cost with Tint is $" + dec.format((Tint * .02) + (texts * .01) + 30));
            
      }
      
}       
 