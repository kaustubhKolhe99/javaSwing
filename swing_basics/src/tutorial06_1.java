import javax.swing.*;
import java.awt.*;

public class tutorial06_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        ImageIcon imageIcon = new ImageIcon("D:\\Programming\\Java\\javaSwing\\tutorial05\\src\\buttonIcon.jpeg"); // creating an image icon

        JButton btn = new JButton(imageIcon); // creating a button object, if a string is passed as an parameter to the constructor then the string appears on the button , if an imageicon object is passed then the image appers as an button
        btn.setSize(imageIcon.getIconWidth(),imageIcon.getIconHeight() ); // sets the size of the button, in this case the button size is set same as the size of the image for convince , the getIconHeight() and getIconWidth() fuctions are used to obtain the image heingt and width
        btn.setLocation(100,100); // setting location of the button
        Font font = new Font( "Arial " , Font.PLAIN , 20); // creating an font object

        btn.setFont(font); // setting the font for the text on the button
        btn.setText("hello"); // dynamically changing the text on the button
        btn.setForeground(Color.RED); // changing the color of the text on the button
        btn.setBackground(Color.YELLOW); // changing the color of the background of the button
        Cursor cursor = new Cursor(Cursor.W_RESIZE_CURSOR); // creating an cursor object
        btn.setCursor(cursor); // changing the cursor while it rovers on the button
        btn.setEnabled(true); // setting button as enable so the button can be clicked, by default the enabled
        btn.setVisible(true); // setting visibility of the button , by default the button is visible (true)



        c.add(btn);
        frame.setVisible(true);

    }
}