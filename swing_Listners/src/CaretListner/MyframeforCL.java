package CaretListner;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class MyframeforCL extends JFrame implements CaretListener {
     JTextArea t1;
     JTextField tf;
    Container c;
    public MyframeforCL(){
        c = getContentPane();
        c.setLayout(null);



        t1 = new JTextArea();
        t1.setBounds(200,50,300,300);
        c.add(t1);
        tf = new JTextField();
        tf.setBounds(50,100,100,20);
        c.add(tf);

        tf.addCaretListener(this); // the cursor on the textfield or text area or the crusor that types the keyboard input is called as carret


    }


    @Override
    public void caretUpdate(CaretEvent e) { // executed when the carret does something
        t1.setText(t1.getText()+"Caret updated"+e.getDot()+" " + e.getMark()+"\n"); // get mark and get dot return the position of the cursor
    }
}

