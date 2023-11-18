import javax.swing.*;
import java.awt.*;

public class gridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();


        frame.setTitle("Flow Layout Example");
        frame.setBounds(100, 100, 400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        GridBagLayout gridBagLayout = new GridBagLayout();
        c.setLayout(gridBagLayout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.25; // requests for extra available space in x, but the button will not expand and remain the same size
        gbc.weighty= 0; // same for y direction

        gbc.fill= GridBagConstraints.HORIZONTAL; // with this method the extra space obtained by the weighx method will be filled with button
        gbc.gridx = 0; // decides the positin of the button in the grid
        gbc.gridy = 0; // be sure to redeclare these variable for each buttons
        c.add(b1,gbc);

//        gbc.weightx=0;
        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(b2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(b3,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth=3; //if the button needs to acquire more than one grid unit, the button length and width can be expanded in terms of grid in x and y by this method
        gbc.ipady = 40; // with this method the width and height of the button can be increased
        c.add(b4,gbc);


        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.ipady=0;
        gbc.anchor = GridBagConstraints.PAGE_END; // by this way button will be anchored to particular position
        gbc.weighty = 50;

        c.add(b5,gbc);






    }
}
