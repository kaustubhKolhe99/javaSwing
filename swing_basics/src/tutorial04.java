import javax.swing.*;
import java.awt.*;

public class tutorial04 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);

    //Password field is the special type of field used for passwords all the methods of the normal text field is applicable for the password text field as well
        JPasswordField passField = new JPasswordField(); // creating object of the password field
        passField.setBounds(100,50,120,30); // setting position of the password field
        c.add(passField);
        passField.setText("hello"); // by default the hello text will be in the password field, it is the method of the normal textfield
        passField.setFont(new Font( "Arial", Font.PLAIN,30)); // passing a font object to the text in the password field
        passField.setEchoChar('*');  // the passed char will be used to hide the password
        passField.setEchoChar((char)0); // password will be visible





        frame.setVisible(true);


















    }
}