import javax.swing.*;
import java.awt.*;

public class tutorial07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextArea textArea = new JTextArea(); // all the properties of the label applies to the text area
        textArea.setBounds(100,100,400,200);
        c.add(textArea);
        c.setBackground(Color.RED);
        frame.setVisible(true);
        textArea.setLineWrap(true); // makes the cursor go automatically go down when the line ends



    }
}
