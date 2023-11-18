import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tutorial06_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionDemo3");
        frame.setBounds(100,100,700,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);
        JButton button = new JButton("Click me");
        button.setBounds(100,100,100,50);
        c.add(button);
       //upto this only normal window with click button is made
        //after this anonymous class is used


        button.addActionListener(new ActionListener() {       //here instead of passing an object of the class which implements action listener interface we passsed an anonymous class
            @Override
            public void actionPerformed(ActionEvent e) { // overriding the method in interface
                //here we will wright the code for action to be performed on clicking the button
                c.setBackground(Color.YELLOW);
            }
        });
    }
}
