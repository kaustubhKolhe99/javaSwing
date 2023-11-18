package CaretListner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyframeforCL myframe = new MyframeforCL();
        myframe.setTitle("Mouse Motion Event");
        myframe.setBounds(100,100,600,600);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
}
