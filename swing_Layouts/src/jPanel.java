import javax.swing.*;
import java.awt.*;

public class jPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Flow Layout Example");
        frame.setBounds(100, 100, 500, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);


        JPanel panel = new JPanel(); // creating a object of Jpanel, panel is the component that can hold other components like button etc
        panel.setBounds(20,0,400,400);
        panel.setBackground(Color.gray);

        c.add(panel);

        JPanel panel2 = new JPanel(); // second panel
        panel2.setBounds(300,0,200,200);
        panel2.setBackground(Color.yellow);
        c.add(panel2);

        JButton button = new JButton("button");
        panel2.add(button); // adding button to panel1


        // by default a panel have flow layout for components
        // a panel can be added to another panel
        panel.add(panel2); // panel2 is added to panel
        panel.setLayout(null); // setting panel layout from default flow layout to null
        panel2.setLocation(20,0); // setting panel 2 location with respect to the panel1

        //panel layout flow



        c.setVisible(true);



    }
}
