import javax.swing.JOptionPane; // Imports JOptionPane object
import java.text.DecimalFormat; // Imports decimal format

/**
Name: Kyle Kincaid
Date: /10/05/2021
Professor: Fahringer

Purpose: This program allows the user to input pay
per day in cents, number of days worked in a month,
and daily multiplier to calculate total pay for that
period. Each day will be multiplied by previous days
cents total.
Days    Cents
1       .05
2       .25
3       1.25
4       6.25
5       31.25

Total   39.05
*/

public class ktkPayDay
{
   public static void main(String[] args)
   {
      String inStr, outStr; // Holds user input
      double cents; // number of cents 
      int days; // number of days worked
      double multiplier; // daily multiplier
      double total = 0; // total pay in dollars
      double dailySub; // each day's total
      double begin; // Variable for beginning days at 1
      
      DecimalFormat dec = new DecimalFormat("###.00"); // create decimal formatting
      DecimalFormat dec1 = new DecimalFormat("#"); // create decimal formatting
      
      //begin getting user input~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      
      inStr = JOptionPane.showInputDialog("<html><i><u>Enter the number of cents: </u></i></html>");
      cents = Double.parseDouble(inStr); // Get user input for cents and convert
      // to double.
      
      inStr = JOptionPane.showInputDialog("<html><i><u>Enter the number of days: </u></i></html>");
      days = Integer.parseInt(inStr); // Get user input for days and convert to
      //double.
      while (days <= 0) // set conditional statement for user input of days
      {
      inStr = JOptionPane.showInputDialog("<html><i><u>Days cannot be zero. Please enter number of days: </u></i></html>");
      days = Integer.parseInt(inStr);
      }     
      
      
      inStr = JOptionPane.showInputDialog("<html><i><u>Enter the multiplier: </u></i><html>");
      multiplier = Double.parseDouble(inStr); // Get user input for multiplier
      //and convert to double.
      
      // process user input~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      
      outStr ="<html><i><u>Days    |    Total (in cents)</u></i></html>\n"; // create header for output
      
      for (begin = 1; begin <= days; begin++) // creates conditional statement for multiplier
         {
            dailySub = cents * Math.pow(multiplier, (begin - 1)); // create math statement for multipler
            outStr = outStr + dec1.format(begin) +  String.format("            $"+ dec.format(dailySub) + "\n"); // create output statement for math
            total += dailySub;; // create math statement for final total being each dailySub added together
      
            }
            
            // final output~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            outStr = outStr + String.format("\n<html><i>Total Pay: $%,.2f</i></html>", total); //creates final output statement with proper punctuation and symbols
            JOptionPane.showMessageDialog(null, outStr); // final output statement. Using outStr is so much easier than trying to combine everything
            }
     } 
          
      /**
      HTML attributes added just for practice.
      */
      
     
      
      
      