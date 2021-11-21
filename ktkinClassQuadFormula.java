/*
 Name: Kyle Kincaid
 Professor: Fahringer
 Date: 10/23/2021
 
 Purpose: Use methods to solve a quadratic formula.
 The main program is already written. Methods will be
 made and called to solve a quadratic equation.
  */

import javax.swing.*;
import java.lang.Math;
import java.text.DecimalFormat;
import java.awt.*;

public class ktkinClassQuadFormula extends JApplet
{
   public void init()
   {
      int a = getA(),
          b = getB(),      // Call on methods to get a, b, and c
          c = getC();
        
        
      double discrim = getDiscrim(a, b, c),     // call on  method to get discrim
             root1 = getRoot1(a,b,c, discrim),  // call on method to get the first root with a positive
             root2 = getRoot2(a,b,c,discrim);   // call on method to get the first root with a positive
             
      display(a,b,c,root1,root2);    // calls on method to display all the information
   
   
   
   }
   public void paint (Graphics screen)
   {
      Graphics2D screen2D = (Graphics2D) screen;
      screen2D.draw
   //------------------------------------------------methods----------------------------
   
   public static int getA() // Method to get value for A
   {
      String inStr, outStr; // Hold user input
      
      inStr = JOptionPane.showInputDialog("Enter value for 'A'");
      int a = Integer.parseInt(inStr); // Parse input into an int
      
      return a;
   }   
   
   public static int getB() // Method to get value for B
   {
      String inStr, outStr; // Hold user input
      
      inStr = JOptionPane.showInputDialog("Enter value for 'B'");
      int b = Integer.parseInt(inStr); // Parse input into an int
      
      return b;
   }
   
   public static int getC() // Method to get value for C
   {
      String inStr, outStr; // Hold user input
      
      inStr = JOptionPane.showInputDialog("Enter value for 'C'");
      int c = Integer.parseInt(inStr); // Parse input into an int
      
      return c;
   }      
    public static double getDiscrim(double a, double b, double c) //Method to get discrim
    {
      
     return (b*b) - (4 * a * c);
      
    }
   
    
    public static double getRoot1(double a, double b, double c, double discrim) //Method to calculate first root
    {
    if (discrim < 0) // if discrim is negative, value will be imaginary, will result in NaN without this
    return 0;
    else
    
    return ((-b) + (Math.sqrt(discrim))) / (2 * a);
    }
    
    public static double getRoot2(double a, double b, double c, double discrim) //Method to calculate second root
    {
     
     if (discrim < 0) // if discrim is negative, value will be imaginary, will result in NaN without this
     return 0;
     else
     return ((-b) - (Math.sqrt(discrim))) / (2 * a);
      
     }
     
     public static void display(int a, int b, int c, double root1, double root2) //Method to display results from calculations
     {
     DecimalFormat dec = new DecimalFormat ("00.00");
         JOptionPane.showMessageDialog(null, 
                     String.format("The value of A is " + a + "\n" + 
                                   "The value of B is " + b + "\n" +
                                   "The value of C is " + c + "\n" +
                                   "The first root is " + dec.format(root1) + "\n" +
                                   "The second root is " + dec.format(root2))); 
     }
      
    }  
   
      
   
   
   
