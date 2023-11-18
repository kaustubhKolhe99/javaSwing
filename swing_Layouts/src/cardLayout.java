import javax.swing.*;
import java.awt.*;

public class cardLayout {
    /*
    A CardLayout object is a layout manager for a container.
    It treats each component in the container as a card.
    Only one card is visible at a time, and the container acts as a stack of cards.


    The first component added to a CardLayout object is the visible component when the container is first displayed.

    Card layout has some useful methods to flip the cards.
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setTitle( "Flow Layout Example");
        frame.setBounds (100,100,600,600);
        frame.setVisible(true) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container=frame.getContentPane();

        CardLayout cardLayout = new CardLayout(); // in cardlayout every component is treated as the page, and one page is shown at a time on the frame
        container.setLayout(cardLayout);

        JButton b1 = new JButton("page1");
        JButton b2 = new JButton("page2");
        JButton b3 = new JButton("page3");
        JButton b4 = new JButton("page4");
        container.add(b1,"1"); // here while adding an component (ie. button in this case ) to the container we care also passing an extra argument, it is an id of the component in the card layout
        container.add(b2,"2");
        container.add(b3,"3");
        container.add(b4,"4");

// in the following method the sequence is according to the sequence of adding component to the container
        cardLayout.next(container); // method to display next component
        cardLayout.previous(container);// method to display next component
        cardLayout.first(container);// method to display first component
        cardLayout.last(container);


        cardLayout.show(container, "3"); // method to display specified component



    }
}
