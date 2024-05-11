import javax.swing.*;
import java.awt.*;
public class flowLayout {
    public static void main(String[] args) {
        /*
        properties of flow layout
        1. Flow Layout is the default Layout for JPane1.
        2. It sets the component as its preferred size in Java.
        3. It also sets the width of the component acc. to its content.
        4. If width of JFrame is less then it shifts the extra components to the next row.
        5. If width of JFrame is more then it aligns the components to the CENTER
         */

        JFrame frame = new JFrame();


        frame.setTitle( "Flow Layout Example");
        frame.setBounds (100,100,600,600);
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0); // the second parameter is the index of the button, it determines the position of the button sequencewise, if the index is not given then the button will be in the sequence as they were added to the container
        c.add(b5,0); // here b4 is also at index 0 and we are giving b5 the index 0 , so the compiler will put the b5 to the index  0 and push the b4 to the next index ie.1
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,20,20); // the first argument is the location of the button, it could be set to left right , center etc, the second and third arguments are the hgap and the vgap
        c.setLayout(flowLayout);
        flowLayout.setHgap(20); // setting h gap using this method
        flowLayout.setVgap(20);// setting v gap using this method






    }
}
