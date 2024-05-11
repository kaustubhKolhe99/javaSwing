import javax.swing.*;
import java.awt.*;

public class tutorial08 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        JRadioButton radioButton = new JRadioButton("male"); // radioButton is used when we want the user to select only one object out of the given options
        radioButton.setBounds(100,50,100,20);
        c.add(radioButton);
        JRadioButton radioButton2 = new JRadioButton("female");
        radioButton2.setBounds(200,50,100,20);
        c.add(radioButton2);
//now the radio button are created the user can select multiple options

        ButtonGroup gender = new ButtonGroup(); // creating an object of the ButtonGroup //
        gender.add(radioButton);
        gender.add(radioButton2); // by adding radioButtons to buttonGroup we can make the radiobutton be a single select
        radioButton.setSelected(true); // by default one radio button is selected

        radioButton.setFont(new Font("arial",Font.BOLD,16));
        radioButton2.setFont(new Font("arial",Font.BOLD,16)); // font of radiobutton can be selected like this


        JRadioButton general = new JRadioButton("general");
        JRadioButton obc = new JRadioButton("obc");
        JRadioButton sc = new JRadioButton("sc");
        JRadioButton st = new JRadioButton("st");
        general.setBounds(100,100,100,20);
        obc.setBounds(200,100,100,20);
        sc.setBounds(300,100,100,20);
        st.setBounds(400,100,100,20);
        c.add(general);
        c.add(sc);
        c.add(obc);
        c.add(st);
        ButtonGroup buttonGroupofCaste = new ButtonGroup();
        buttonGroupofCaste.add(general);
        buttonGroupofCaste.add(obc);
        buttonGroupofCaste.add(sc);
        buttonGroupofCaste.add(st);
        general.setSelected(true);
        obc.setEnabled(false); // a radio button can be disabled using this method




        frame.setVisible(true);
    }
}
