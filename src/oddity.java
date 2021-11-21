import javax.swing.*;
public class oddity
{
public static void main(String[] args)
{
int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
double d= distance(x1, x2,  y1,  y2);
display(d);
}
public static double distance(int x1, int x2, int y1, int y2)
{
String inStr, outStr;
inStr = JOptionPane.showInputDialog("Enter X1: ");
x1 = Integer.parseInt(inStr);

inStr = JOptionPane.showInputDialog("Enter x2: ");
x2 = Integer.parseInt(inStr);

inStr = JOptionPane.showInputDialog("Enter y1: ");
y1 = Integer.parseInt(inStr);

inStr = JOptionPane.showInputDialog("Enter y2: ");
y2 = Integer.parseInt(inStr);
return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
}
public static void display(double d)
{
JOptionPane.showMessageDialog(null, "Distance is: " + d);
}
}