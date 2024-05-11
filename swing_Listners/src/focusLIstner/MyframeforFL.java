package focusLIstner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyframeforFL extends JFrame implements FocusListener {
     JTextArea t1;
     JTextField tf;
    Container c;
    public MyframeforFL(){
        c = getContentPane();
        c.setLayout(null);



        t1 = new JTextArea();
        t1.setBounds(200,50,300,300);
        c.add(t1);
        t1.addFocusListener(this);
        tf = new JTextField();
        tf.setBounds(50,100,100,20);
        c.add(tf);



    }


    @Override
    public void focusGained(FocusEvent e) { // method is called when the focus/cursor selects the component
        t1.setText(t1.getText() + "\nfocus gained");

    }

    @Override
    public void focusLost(FocusEvent e) { // method is called when the focus /cursor selects the other component
        t1.setText(t1.getText() + "\nfocus lost");

    }
}

