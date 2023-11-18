import javax.swing.*;
import java.awt.*;

public class tutorial03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);
// text field is the field where the window can take text input from the user
        JTextField t1 = new JTextField(); // creating an object of the TextField
        t1.setBounds(100,50,120,30); // positioning the textfield
        c.add(t1);
        frame.setVisible(true); // window must be made visible after all the attributes are added, if not then the attributes after the method call will not be visible in the window

        t1.setText("hello"); // inititally sets the text in the textfield, user can change it
        Font font = new Font("Arial", Font.BOLD, 25); // creating a font object
        t1.setFont(font); // sets font of the font object to the text in the text field
        t1.setForeground(Color.GREEN);// changes the color of the text of the text field
        t1.setBackground(Color.YELLOW); // changes the background color of the text field
        t1.setEditable(false); // user cannot change the text in text field


















    }
}