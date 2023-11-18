import javax.swing.*;
import java.awt.*;

public class gridLayout {
/*
1. Just Like Flow Layout,
Grid Layout also sets the components left-to-right in a flow.
2. In Grid Layout all the available space is consumed by the components.
3. Grid Layout can be divided into the form of rows and columns.
4. In Grid Layout all the components have the same size.
 */
    public static void main(String[] args) {
        JFrame frame = new JFrame();


        frame.setTitle( "Flow Layout Example");
        frame.setBounds (100,100,400,600);
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        GridLayout gridLayout = new GridLayout(2,3, 10 ,20); // rows and column of the grid can be passed as arguments, hgap and vgap can be paseed here or can be set using seperated methods
        c.setLayout(gridLayout);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5,0);// indexing works the same as it does for flow layout

        gridLayout.setHgap(10);
        gridLayout.setVgap(20);




    }
}
