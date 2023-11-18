import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class f extends JFrame implements ActionListener {
    Container c;
    JTextField t1;
    
                        //nothing new here
    public f(){
        c = getContentPane();
        c.setLayout(null);
        
        t1 = new JTextField();
        t1.setBounds(100,100,100,30);
        c.add(t1);
        t1.setFont(new Font( "Aral", Font.BOLD,15));

        t1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String string = t1.getText();
        t1.setText(string.toUpperCase());
    }
}
public class tutorial14_1 {
    public static void main(String[] args) {
        f frame= new f();
        frame.setTitle("Action Event");
        frame.setBounds(100,100,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
