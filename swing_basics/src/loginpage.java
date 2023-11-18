import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Frame extends JFrame implements ActionListener {

// declaring required objects
    Container c;
    JLabel label1, label2;
    TextField user;
    JPasswordField pass;
    JButton btn;

    Frame(){
        setTitle("Login Form");
        setBounds(100,100,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);

        c.add(label1);
        c.add(label2);

        user = new TextField();
        user.setBounds(120,50,120,20);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(120,100,120,20);
        c.add(pass);

        btn = new JButton("Login");
        btn.setBounds(100,150,70,20);
        c.add(btn);
        btn.addActionListener(this);

        setVisible(true); // should be at end to make all attributes visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println( "Username: " + user.getText()); // user.getText() method is used to obtain text entered by user
        System.out.println( "Password: " + pass.getText());
    }
}
public class loginpage {

    public static void main(String[] args) {
        // creating a login form
         Frame frame = new Frame();

    }
}
