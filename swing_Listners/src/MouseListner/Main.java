package MouseListner;

import MouseListner.MyframeforML;
import keyevent1.Myframe;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyframeforML myframe = new MyframeforML();
        myframe.setTitle("Mouse Event");
        myframe.setBounds(100,100,600,600);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
}
