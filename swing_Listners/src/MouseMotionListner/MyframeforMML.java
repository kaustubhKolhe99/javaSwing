package MouseMotionListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyframeforMML extends JFrame implements MouseMotionListener {
    JLabel label;
    JTextArea ta;
    Container c;
    public MyframeforMML(){
        c = getContentPane();
        c.setLayout(null);

        label = new JLabel("my label");
        label.setFont(new Font("Arial",Font.BOLD,18));
        label.setBounds(50,100,100,30);
        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);
        label.addMouseMotionListener(this);



    }


    @Override
    public void mouseDragged(MouseEvent e) { // method is called when the mouse is dragged on the element , dragged means clicked and moved
        ta.setText(ta.getText() +"\nMouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) { // method gets called when the mouse is moved, on the component
        ta.setText(ta.getText() +"\nMouse Moved");

    }
}

