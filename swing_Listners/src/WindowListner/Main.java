package WindowListner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyframeforWL f = new MyframeforWL();
        f.setTitle("window event example");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,500);
    }
}
