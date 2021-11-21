import javax.swing.JOptionPane;

/**
   Name: Kyle Kincaid
   Date: 09/17/2021
   Class: CPS-121
   Program purpose: To allow user to input data for display with prompts
   with only one output display.
   */
   
   public class NamesDialog1
   {
      public static void main(String[] args)
      {
         String firstName, lastName, birthMonth, birthDay, birthYear;
         
         firstName = JOptionPane.showInputDialog("What is your first name?"); //Prompt user for first name.
         lastName = JOptionPane.showInputDialog("What is your last name?"); //Prompt user for last name.
         birthMonth = JOptionPane.showInputDialog("What is your birth month?"); //Prompt user for birth month.
         birthDay = JOptionPane.showInputDialog("What is your birth day?"); //Prompt user for birth day.
         birthYear = JOptionPane.showInputDialog("What is your birth year?"); //Prompt user for birth year.
         JOptionPane.showMessageDialog(null, "Name: " + firstName +" " + lastName + "\nBirthday: " + birthMonth + "/" + birthDay + 
         "/" + birthYear);
         JOptionPane.showMessageDialog(null, "Thanks for playing!"); //Just an extra surprise for the user.
         
        
         }
}         
        