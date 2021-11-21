import java.util.Scanner; //imports Scanner object
import javax.swing.JOptionPane; // imports JOptionPane
import java.text.DecimalFormat; // Imports decimal format.

/**
Name: Kyle Kincaid
Professor: Fahringer
Class: CPS 121
Date: 10/1/2021

This program allows the user to input criteria
to calculate regular shipping charges and 
additional surcharge.
*/

public class ShippingCharges
{
   public static void main(String[] args)
      {
          DecimalFormat dec = new DecimalFormat("0.00"); //sets output for two decimal places    
          String inStr="", outStr=""; // Holds input and output string
          double regularCharge; // Holds regular shipping charge
          String Zip; // Zip code entered by user
          double Sur1; // First additional surcharge percentage
          double Sursub; // First additional surcharge amount
          double Sur2; // Second additional surcharge
          double Surtot; // Second additional surcharge amount
          double weight; // Weight of the package
          double length; // Length of the package
          double width; // width of the package
          double height; // height of the package
          double dimension; // product of length, width, and height
          double sub; // subtotal of regular charge and first surcharge
          double total; // total of sub and second surcharge
          
         Zip = JOptionPane.showInputDialog("Enter the zip code: ");
         // Asks the user for the zip code
         
         if(Zip.startsWith("4"))  
         {
            Sur1 = .05;
         }
         else if(Zip.startsWith("6"))
         {
            Sur1 = .07;
               
         }
         else
         {
            Sur1 = .09;
            
            // Sets if statements for Zip code and first surcharge rate.
         }   
         if(Zip.endsWith("0"))
         {
            Sur2 = .02;
         }  
         else if(Zip.endsWith("2"))
         { 
            Sur2 = .02;
         }
         else if(Zip.endsWith("4"))
         {
            Sur2 = .02;
         }
         else if(Zip.endsWith("6"))
         {
            Sur2 = .02;
         }
         else if(Zip.endsWith("8"))
         {
            Sur2 = .02;
         }             
         else
         {
            Sur2 = 0;
         }   
         
         // Sets if statement for zip ending in even number and 
         //secondary surcharge. There is probably a more conscise coding
         //for checking for an even number.
         
         inStr = JOptionPane.showInputDialog("Enter the weight of the package in pounds: ");
         // Asks the user for the weight of the package
         
         weight = Double.parseDouble(inStr);
         // Converts input from String to double.
         
         inStr = JOptionPane.showInputDialog("Enter the length of the package in inches: ");
         // Asks the user for the length of the package
         
         length = Double.parseDouble(inStr);
         // Converts input from string to double
         
         inStr = JOptionPane.showInputDialog("Enter the width of the package in inches: ");
         //Asks the user for the width of the package
         
         width = Double.parseDouble(inStr);
         // Converts input from string to double
         
         inStr = JOptionPane.showInputDialog("Enter the height of the package in inches: ");
         // Asks the user for the height of the package
         
         height = Double.parseDouble(inStr);
         // Converts input from string to double
         
         dimension = length * width * height;
         // Defines variable dimension
         
         regularCharge = 0;
         // initialize regularCharge
      
         // Set if /else if statements for dimension       
         if (weight < 5)
         {
           regularCharge = 10;
            }
            else if (dimension > 5 && dimension <= 15)
            {
           regularCharge = 12;
            }
            else if (dimension > 15 && dimension <= 30)
            {
           regularCharge = 14;
            }
            else if (dimension >30 && dimension <= 45)
            {
           regularCharge = 16;
            }
            else if (dimension >45 && dimension <= 60)
            {
           regularCharge = 18;
            }
            else if (dimension > 60)
            {
           regularCharge = 25;
            }
            Sursub = (regularCharge * Sur1);
            sub = ((regularCharge * Sur1) + regularCharge);
            Surtot = (sub * Sur2);
            total = ((sub * Sur2) + sub);
            
            JOptionPane.showMessageDialog(null,"The zip code and dimensions are: " + Zip + ", " + dec.format(dimension)+"''" + " and " + dec.format(weight) + " lbs.");
            JOptionPane.showMessageDialog(null,"The regular shipping charge is: $" + dec.format(regularCharge));
            JOptionPane.showMessageDialog(null,"The surcharge is: $" +dec.format(Sursub) + " primary surcharge and $" + dec.format(Surtot) + " secondary surcharge" + 
            " for a total of: $" + dec.format(Sursub + Surtot));
            JOptionPane.showMessageDialog(null,"Your total shipping charge is: $" + dec.format(total));
            
         
         
          }
          }
