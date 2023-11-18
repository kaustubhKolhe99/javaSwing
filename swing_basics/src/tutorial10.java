import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tutorial10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);
        String[] values = {
                "A","B","C","D","C","C"
        };
        JComboBox c1 = new JComboBox(values); // creating an object of JComboBox, its constructor takes an array of strings as input
        c1.setBounds(100,100,100,20);
        c.add(c1);
        c1.setEditable(true); // by setting this method ture, user can select an option that is not in the list
        c1.setSelectedItem("t");//by default this will be in the box
        c1.setSelectedIndex(3); // sets the element on the index of the input string array initially
        c1.setFont(new Font( "Arial", Font.PLAIN,14));


        JButton button = new JButton("OK");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label = new JLabel();
        label.setBounds(100,300,100,30);
        c.add(label);
        c1.addItem("E"); // used to add value to the values array of items
        c1.removeItem("C"); // used to remove value from the array, if the array has same value multiple times then the method will remove only first element

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String item = (String) c1.getSelectedItem(); // getSelectedItem() method return the item selected by the user, return type is not string but an object, so it has to be converted ot string
                String item = String.valueOf(c1.getSelectedIndex()); //getSelectedItem() return the index of the selected item, return -1 if it is not in the array
                label.setText(item);



            }
        });



        frame.setVisible(true);

    }
}