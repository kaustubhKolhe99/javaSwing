package MouseMotionListner;

import MouseListner.MyframeforML;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyframeforMML myframe = new MyframeforMML();
        myframe.setTitle("Mouse Motion Event");
        myframe.setBounds(100,100,600,600);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
}
