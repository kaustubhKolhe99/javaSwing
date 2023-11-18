import javax.swing.*;
import java.awt.*;

public class boxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible (true);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
        frame.setBounds (100,100,500,400);
        frame.setTitle ("Box Layout Example");
        Container container = frame.getContentPane ();

        BoxLayout boxLayout = new BoxLayout(container,BoxLayout.Y_AXIS); // boxLayout only has one constructor, it takes two parameters, container and axis of the components
        container.setLayout(boxLayout);

        JButton b1 = new JButton("button 1");
        JButton b2 = new JButton("button 2");
        JButton b3 = new JButton("button 3");
        JButton b4 = new JButton("button 4");

        container.add(b1);
        container.add(Box.createRigidArea(new Dimension(0,80))); // this is how space is added between two buttons
        container.add(b2);
        container.add(b3);
        container.add(b4);

        b1.setAlignmentX(Component.CENTER_ALIGNMENT); // alignemnt is set
        b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b3.setAlignmentX(Component.RIGHT_ALIGNMENT);
        b4.setAlignmentX(Component.RIGHT_ALIGNMENT);




    }


}
