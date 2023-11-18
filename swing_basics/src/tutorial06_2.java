import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener { // to make a working button we need a class that implements ActionListener interface
    Container c ; // declaring an container
    JButton button ; // declaring button

    MyFrame(){
        c = this.getContentPane();
        c.setLayout(null);
        button = new JButton("click me"); // initializing button object
        button.setBounds(100,100,100,50); // setting button bounds
        c.add(button); // adding button to the container
        button.addActionListener(this); // calling addActionListener function which takes the object which implements the ActionListener interface

    }
    @Override
    public void actionPerformed(ActionEvent e){ // overriding actionPerformed class
        // the action that will be performed on clicking the button
        c.setBackground(Color.YELLOW); //making the background of the frame yellow

    }



}
public class tutorial06_2 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("ActionDemo");
        f.setSize(700,500);
        f.setLocation(100,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
