    import java.util.Scanner;

    import javax.swing.JOptionPane;

    public class practice1 {

        public static void main(String[] args) {

        String msg=JOptionPane.showInputDialog("Enter a number");
        int num1=Integer.parseInt(msg);
        String msg2=JOptionPane.showInputDialog("enter another number");
        int num2=Integer.parseInt(msg2);
        int addition=num1+num2;

        String msg3=JOptionPane.showInputDialog("What is" + num1 + "+ " + num2 + " ? ");

        int answer=Integer.parseInt(msg3);

    while(num1+num2!=answer){

        JOptionPane.showMessageDialog(null,"try again");
        String answer2=JOptionPane.showInputDialog("wrong. what is " + num1 + "+" + num2 + "?");
        answer=Integer.parseInt(answer2);

    }
    JOptionPane.showMessageDialog(null,"GREAT job");
    System.exit(0);

}
}        