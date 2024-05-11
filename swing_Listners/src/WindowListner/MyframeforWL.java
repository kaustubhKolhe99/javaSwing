package WindowListner;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyframeforWL extends JFrame implements WindowListener {

    public MyframeforWL(){
        this.addWindowListener(this);

    }






    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened"); // this is the second fuction that will be called after the window is opened
    }

    @Override
    public void windowClosing(WindowEvent e) { // this method is called when the user is closing the window
        System.out.println("window closing");

    }

    @Override
    public void windowClosed(WindowEvent e) { // i dont know when this method is called, find out on your own
        System.out.println("window closed");

    }

    @Override
    public void windowIconified(WindowEvent e) { // this method is called when the window is minimised
        System.out.println("window iconified");

    }

    @Override
    public void windowDeiconified(WindowEvent e) { // this method is called when the method is opened after being minimised
        System.out.println("window deiconified");

    }

    @Override
    public void windowActivated(WindowEvent e) { // this is the first method that will be called when the window is opened , this method is called beforet he window opened method, this method is called when the user shifts focus to the window
        System.out.println("window activated");

    }

    @Override
    public void windowDeactivated(WindowEvent e) { // this method is called when the user shifts the focus from current window to another window
        System.out.println("window deactivated");

    }
}
