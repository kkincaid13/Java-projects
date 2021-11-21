import javax.swing.*; //Imports JOptionPane
import java.text.DecimalFormat; //Imports Decimal formatting
import java.lang.*; // Imports Math language

/**
Name: Kyle Kincaid
Professor: Fahringer
Date: 11/16/2021

Purpose: The purpose of this program is to take user input for the
dimensions of a flower bed and output the dimensions of the perimeter
to determine how much wood is needed and how many bags of mulch is needed
at a rate of each bag equaling 2 cubic feet, one cubic foot is 12 x 12 x 12 = 1728 inches.
Perimeter for flower bed should be equal to length times width. Volume of
flower bed should be equal to length times width times height.
This is the class built to handle objects.
This class also adds the methods for setHeight and getHeight.
*/

public class MulchKTK2
{
      private double length; //Create private variables
      private double width;
      private double height;
   /**
      Constructor
      @param len The length of the bed.
      @param wid the width of the bed.
   */   
   
   
   public MulchKTK2() //Initializes empty object
   {
      length = 0;
      width = 0;
      height = 0;
   }  
   
   public MulchKTK2(double len) //Set variables to same value.
   {
      length = len;
      width = len;
      height = len;
   }   
   
   public MulchKTK2(double len, double wid, double high) // Defines object variables
   {
      length = len;
      width = wid;
      height = high;
   }   
   
   /**
      setLength method stores a value for length
      @param len The value to store in length.
    */  
   
   public void setLength(double len)
   {
      length = len;
      
   }
   /**
      getLength returns the object length
      @return The value in length.
   */   
   public double getLength()
   {
      length = length*12;      
      return length;
   }  
   /**
      setWidth stores a value in the width field
      @param wid The value to store in width.
   */   
   public void setWidth(double wid)
   {
      width = wid;
      
   }
   /**
      getWidth returns the value in the width field
      @return The value in the width field
   */   
   
   public double getWidth()
   {
      width = width*12;
      return width;
   }     
   
   /**
     setHeight stores a value in the height field
     @param high The value to store in the height field
   */
   public void setHeight(double high)
   {
      height = high;
   }
   
   /**
      getHeight returns the value
      @return The value in the height field   
   */
   public double getHeight()
   {
      return height;
   }        
   /**
      Returns length times width
      @return Product of length times width
   */   
   public double getPerim()
   {
    
    return (length + width) * 2;
   }   
   /**
      Returns volume, length time width times height
      @return The volume of the bed.
   */   
   public double getVol()
   {
      
      return (length * width * height);
   }
   /**
      Returns the number of bags of mulch needed
      @return Number of bags of mulch.
   */   
   public double getNumBags()
   {
      
      return (int)Math.ceil((((length*12) * (width*12) * height) / 3456));
   }      
   
   public String toString() // Create format for displaying end result
   {
      DecimalFormat dec = new DecimalFormat("##,###.##"); //Create a format for number output
      String outStr = "Length: " + dec.format(length) + "(inches)\n" +
                      "Width: " + dec.format(width*12) + "(inches)\n" +
                      "Height: " + dec.format(height) + "(inches)\n" +
                      "Perimeter: " + dec.format((length*12 + width*12)*2) + "(inches)\n" +
                      "Volume: " + dec.format(length*12 * width*12 * height) + "(cubic inches)\n" +
                      "Bags of Mulch: " + dec.format(Math.ceil(((length*12 * width*12 * height)/3456))); 
     
      return outStr;
    }
}         