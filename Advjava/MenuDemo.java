package Advjava;
import javax.swing.JFrame; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar;
public class MenuDemo extends JFrame
{
JMenu fileMenu, editMenu, exitMenu; 
JMenuBar menuBar;
public MenuDemo()
{
menuBar = new JMenuBar();
fileMenu = new JMenu("File"); 
editMenu = new JMenu("Edit");
exitMenu = new JMenu("Exit");
menuBar.add(fileMenu); 
menuBar.add(editMenu); 
menuBar.add(exitMenu);
setJMenuBar(menuBar); 
setTitle("JMenu Demo"); 
setSize(300, 300); 
setVisible(true);
}
public static void main(String[] args)
{
MenuDemo mobj = new MenuDemo();
}}