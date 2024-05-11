import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class fra extends JFrame  implements ItemListener {

        JTextArea ta;
        JCheckBox  c1,c2;

    public fra(){
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(250,50,100,50);
        c.add(ta);

        c1 = new JCheckBox("10th");
        c1.setBounds(50,50,50,20);
        c.add(c1);

        c1.addItemListener(this);
        






    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ta.setText("clicked");
    }
}

public class tutorial15_1 {
    public static void main(String[] args) {
        fra frame = new fra();
        frame.setBounds(100,100,400,400);
        frame.setTitle("item listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
