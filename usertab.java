// USER TAB Demo
// 2082-02-12

import java.awt.*;
import javax.swing.*;
public class usertab extends JFrame 
{
        usertab(String s)
    {
  super(s);
 JTabbedPane tabbedPane = new JTabbedPane(); 
JLabel label1 = new JLabel( "panel one");
JPanel panel1 = new JPanel(); 
panel1.add( label1 ); 
tabbedPane.addTab( "Tab One", null, panel1, "First Panel" );
JLabel label2 = new JLabel( "panel two"); 
JPanel panel2 = new JPanel();  
panel2.setBackground( Color.YELLOW ); 
panel2.add( label2 ); 
tabbedPane.addTab( "Tab Two", null, panel2, "Second Panel" );
add(tabbedPane);
  }
public static void main(String s[])    
{
usertab obj=new usertab("tab demo");
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.setSize(300,400);
}
}