import javax.swing.*; //Import JOptionPane

/**
   This is a constructor demo of the MulchKK class
*/   

public class ktkMulchDemo2  
{
   public static void main(String[] args)
   {
   
   MulchKTK2 box = new MulchKTK2(); // Create new Mulch object
      String inStr; // Create a sting to hold input
      inStr = JOptionPane.showInputDialog("Enter the length of the flower bed in feet: ");
      box.setLength(Double.parseDouble(inStr));//Parse the input to a double
      //and passes the value to the setLength method.
      
      inStr = JOptionPane.showInputDialog("Enter the width of the flower bed in feet: ");
      box.setWidth(Double.parseDouble(inStr));//Parse the input to a double
      //and passes the value to the setWidth method.
      
      inStr = JOptionPane.showInputDialog("Enter the height of the flower bed in inches: ");
      box.setHeight(Double.parseDouble(inStr));//Parse the input to a double
      //and passes the value to the setHeight method.
      
      JOptionPane.showMessageDialog(null,box.toString());//Calls the toString method
      //to display the output.
                                     
      
    }
}
      
      