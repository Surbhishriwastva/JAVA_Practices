package Advjava;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPane extends JFrame {
    JTabbedPane obj;

    public TabbedPane() {
        obj = new JTabbedPane(JTabbedPane.BOTTOM);
        obj.addTab("Tab1", null);
        obj.addTab("Tab2", null);
        obj.setSize(100, 100);
        this.setTitle("JTabbedPane Demo");
        this.setVisible(true);
        this.setSize(300, 200);
        this.add(obj);
    }

    public static void main(String[] args) {
        TabbedPane tobj = new TabbedPane();
    }
}