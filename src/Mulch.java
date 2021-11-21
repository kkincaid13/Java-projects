import javax.swing.*;
import java.text.DecimalFormat;
import java.lang.*;

/**
Name: Kyle Kincaid
Professor: Fahringer
Date: 11/12/2021

Purpose: The purpose of this program is to take user input for the
dimensions of a flower bed and output the dimensions of the perimeter
to determine how much wood is needed and how many bags of mulch is needed
at a rate of each bag equaling 2 cubic feet, one cubic foot is 12 x 12 x 12 = 1728 inches.
Perimeter for flower bed should be equal to length times width. Volume of
flower bed should be equal to length times width times height. Height is
given to be 3 inches.
*/

public class MulchKK
{
      private double length;
      private double width;
   /**
      Constructor
      @param len The length of the bed.
      @param wid the width of the bed.
   */   
   
   public MulchKK()
   {
      length = 0;
      width = 0;
   }  
   
   public MulchKK(double len, double wid)
   {
      length = len;
      width = wid;
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
      Returns length times width
      @return Product of length times width
   */   
   public double getPerim()
   {
    
    return (length + width) * 2;
   }   
   /**
      Returns volume, length time width times height(3)
      @return The volume of the bed.
   */   
   public double getVol()
   {
      
      return (length * width * 3);
   }
   /**
      Returns the number of bags of mulch needed
      @return Number of bags of mulch.
   */   
   public double getNumBags()
   {
      
      return (int)((length * width * 3) / 3456);
   }      
   
   public String display()
   {
      String outStr = "Length: " + length*12 + "(inches)\n" +
                      "Width: " + width*12 + "(inches)\n" +
                      "Height: 3 (inches)\n" +
                      "Perimeter: " + (length*12 + width*12)*2 + "(inches)\n" +
                      "Volume: " + (length*12 * width*12 * 3) + "(cubic inches)\n" +
                      "Bags of Mulch: " + Math.ceil(((length * width * 3)/3456)); 
     
      return outStr;
    }
}         