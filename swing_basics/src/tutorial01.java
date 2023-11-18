import javax.swing.*;
import java.awt.*;

public class tutorial01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true); // makes window visible,  the window is by default invisible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the program on closing the window , by default the program does not terminate on closing the window
        frame.setSize(700,500); // sets size of the window, by default the size is 0 , 0
        frame.setLocation(100,100); // sets the initial position of the window, by default the window opens at left up corner
        frame.setBounds(100,100,1000,500);// sets window position and size in the single function/ method
        frame.setTitle("my frame"); // sets title of the window, by default the title is java


        // set icon of the window
        ImageIcon icon = new ImageIcon("D:\\Programming\\Java\\javaSwing\\untitled\\src\\icon2.png"); // first create the obj of the ImageIcon class , pass name of the file or location of the file if the file is not in the same class as the main (for some reason name doesn't work, so I put the location of the file and it works)
        frame.setIconImage(icon.getImage());  // sets icon of the window

        Container c = frame.getContentPane();


        // method first
        c.setBackground(Color.RED);
        // method second
        Color color = new Color(255,0,0);
        c.setBackground(color);

        frame.setResizable(false); // allows the window not to be resized, by default the window is resizable(true)












    }
}