import javax.swing.*;
import java.awt.*;

public class tutorial09 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("intermediate");
        JCheckBox c3= new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("Post Graduation");

        c1.setBounds(100,50,120,20);
        c2.setBounds(100,100,120,20);
        c3.setBounds(100,150,120,20);
        c4.setBounds(100,200,120,20);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c1.setSelected(true);
        c2.setEnabled(false);






        frame.setVisible(true);
    }


}
