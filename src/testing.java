import javax.swing.JOptionPane;
/**
 * Print List
**/
public class testing
{
public static void main (String[] args) {
  String display="";

    String size = JOptionPane.showInputDialog("Enter Your Prefered Size Of Your Array");
    int newsize = Integer.parseInt(size);
    JOptionPane.showMessageDialog(null,"You Entered "+newsize+".");

    String array[] = new String[newsize];

    for (int a=0; a<array.length;a++)
    {
        array[a] = JOptionPane.showInputDialog("Enter Value For Array["+a+"].");
        display = display +array[a] + "\n";
    }


    JOptionPane.showMessageDialog(null,display);
        
    }
}
