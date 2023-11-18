import javax.swing.*;
import java.awt.*;

public class tutorial02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1500,1500);
        Container c = frame.getContentPane();
        c.setLayout(null); // layout is null
        /*
        JLabel label = new JLabel("username");
        label.setBounds(100,50,200,30); // sets the position of the label text and size of the text like height and width for the text
        label.setText("Password"); // changes the text field to the new text Password

        Font font = new Font("Arial",Font.PLAIN,30); // first create an object of the font class then it can be set to a text
        label.setFont(font); // sets the font to the label
        */
        ImageIcon icon = new ImageIcon("D:\\Programming\\Java\\javaSwing\\tutorial02\\src\\icon2.png");
        //JLabel label = new JLabel(icon);
        //label.setBounds(100,50,200,30); // this is constant size allocated to the image so if the image size is bigger than this height the image will be partially displayed
        //label.setBounds(100,20, icon.getIconWidth(),icon.getIconHeight()); // this way the width and height of the image is same as the image height and width
        JLabel label = new JLabel("text", icon, JLabel.LEFT); // how to show image and text at same time // the position is with respect to the give height and width in the next line or setBound function
        label.setBounds(0,100,500,500); // position and size of the image and text


        c.add(label);
















    }
}