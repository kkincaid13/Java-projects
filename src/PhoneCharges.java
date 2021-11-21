import javax.swing.JOptionPane; //Imports the JOptionPane utility.

/**
This program is used to calculate the cost for
comparing telephone company services and determining 
the cheapest rate.
*/

public class PhoneCharges
{
   public static void main(String[] args)
   {
      
      String inputString; // For reading input
      double flatFee; // The company's flat fee
      double minutes; // The amount of minutes
      double texts; // The amount of texts
      double total; // The total monthly cost
      
      // Ask the user for flat fee rate.
      inputString = JOptionPane.showInputDialog("What is the " + 
      "flat fee?");
      
      // Convert the input to an int.
      flatFee = Integer.parseInt(inputString);
         
      
      // Ask the user for the number of minutes.
      inputString = JOptionPane.showInputDialog("How many minutes" + 
      " will you use?");
      
      // Convert the input to a double.
      minutes = Double.parseDouble(inputString);
      
      
      // Ask the user for the number of texts
      inputString = JOptionPane.showInputDialog("How many texts " + 
      "will you use?");
      
      // Convert the input to a double.
      texts = Double.parseDouble(inputString);
      
      if (flatFee == 5 )
      {
         minutes = (minutes - 100) * .03;
         texts = texts * .05;
      }   
      else if (flatFee == 10)
      {
         minutes = (minutes - 200) *.05;
         texts = texts * .03;
         }
      else if (flatFee == 30)
      {
         minutes = (minutes - 400) *.02;
         texts = texts * .01;
         }
      
      // Calculate total cost
      total = flatFee + minutes + texts;
      
      if (flatFee == 5)
      {
      JOptionPane.showMessageDialog(null, "The total monthly cost with AB&C is " + total);
      }
      else if (flatFee == 10)
      {
      JOptionPane.showMessageDialog(null, "The total monthly cost with Horizon is " + total);
      }
      else if (flatFee == 30)
      {
      JOptionPane.showMessageDialog(null, "The total monthly cost with Tint is " + total);
      }
      
      
      }
      
}       
      
    