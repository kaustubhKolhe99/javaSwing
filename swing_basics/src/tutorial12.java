import javax.swing.*;

public class tutorial12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menubar Example");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JMenuBar  menuBar = new JMenuBar();  // creating an object of a menubar object, it is must to have.


        JMenu file = new JMenu("File"); // creating an object of Jmenu, this object will the button appearing in the menubar

        JMenuItem i1  = new JMenuItem("New"); // creating an object of the JMenuItem this is the buttons appearing in the Menu,
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        file.add(i1); // adding the menuItems to the menu
        file.add(i2);
        file.add(i3);
        menuBar.add(file); // adding the menu to the menubar
        frame.setJMenuBar(menuBar); // adding the menubar to the frame
        // no need to add anything to the container
        JMenu edit = new JMenu("Edit"); // creating second menu
        JMenuItem undo = new JMenuItem("Undo"); // creating item for second menu
        JMenuItem redo = new JMenuItem("Redo");
        edit.add(undo);// adding menuitem to the menu
        edit.add(redo);
        menuBar.add(edit);// adding the edit menu to the menubar
       // file.add(edit); // similarly we can add menu to another menu and the menu will open in the menu and so on
        frame.setVisible(true);
    }
}
