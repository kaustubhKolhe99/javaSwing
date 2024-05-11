package MouseListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyframeforML extends JFrame implements MouseListener {
    JLabel label;
    JTextArea ta;
    Container c;
    public MyframeforML(){
        c = getContentPane();
        c.setLayout(null);

        label = new JLabel("my label");
        label.setFont(new Font("Arial",Font.BOLD,18));
        label.setBounds(50,100,100,30);
        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);
        label.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) { //when the mouse is pressed and after released the click happens
        ta.setText(ta.getText()+ "\n Mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) { //when is the mouse button is pressed this is the first event that happens
        ta.setText(ta.getText()+ "\n Mouse is pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) { // when them mouse is pressed it is released then it is clicked
        ta.setText(ta.getText()+ "\n Mouse is Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) { // when the mouse cursor goes to rover over the component, mouse is entered
        ta.setText(ta.getText()+ "\n Mouse is Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) { // when the mouse cursor leaves the component, then mouse is exited
        ta.setText(ta.getText()+ "\n Mouse is exited");

    }
}
