package keyevent1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Myframe extends JFrame implements KeyListener {
    JTextArea ta ;
    Container c;
    public Myframe(){
        c = getContentPane();
        c.setLayout(null);
        ta  = new JTextArea();
        ta.setBounds(10,10,350,350);
        c.add(ta);
        ta.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\nkey is typed: "+e.getKeyChar()); // executes when key is typed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\nkey is pressed: "+ e.getKeyChar()); // executes when key is pressed, before it is typed

    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\nkey is released: "+ e.getKeyChar()); // executes when key key is released, after the key is typed

    }
}
