import javax.swing.*;
import java.awt.*;
 // border layout
public class borderLayout {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        frame.setTitle("Border layout");
        frame.setBounds(100,100,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout borderLayout = new BorderLayout(10,5); // by default frame has border layout, arguments are gap between each components
        borderLayout.setHgap(10); // gaps can be added this way too
        borderLayout.setVgap(5);


        Container c = frame.getContentPane();
        c.setLayout(borderLayout);

        JButton b1 = new JButton("PageStart");
        JButton b2 = new JButton("PageEnd");
        JButton b3 = new JButton("LineStart");
        JButton b4 = new JButton("center");
        JButton b5 = new JButton("lineEnd");

        c.add(b1,BorderLayout.PAGE_START); //this is how position is defined
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b5, BorderLayout.LINE_END);
        c.add(b4,BorderLayout.CENTER); // if the frame is resized then only the size of the center increases and the rest of the components remains of the same size




//        c.add(b1);
        frame.setVisible(true);



    }
}
