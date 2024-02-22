package Advjava;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo extends JFrame {
    JPanel obj;

    public PanelDemo() {
        obj = new JPanel();
        setTitle("JPanel Demo");
        setVisible(true);
        setSize(300, 200);
        add(obj);
    }

    public static void main(String[] args) {
        PanelDemo pobj = new PanelDemo();
    }
}