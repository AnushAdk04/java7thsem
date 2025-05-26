// Menu Demo another part
// 2082-02-12

import java.awt.event.*;
import javax.swing.*;
public class menudemo1 extends JFrame
{
        JPopupMenu popupmenu;
    menudemo1()
    {
  super("menu demo");
 JRadioButtonMenuItem[] items; 
 String[] colors = { "Blue", "Yellow", "Red" }; 
items = new JRadioButtonMenuItem[ colors.length ];
   popupmenu = new JPopupMenu(); 
 for ( int count = 0; count < items.length; count++ )
{
items[ count ] = new JRadioButtonMenuItem( colors[ count ] );
popupmenu.add( items[ count ] ); 
}
addMouseListener(
new MouseAdapter() 
{
public void mousePressed( MouseEvent event )
{
popupmenu.show(event.getComponent(), event.getX(), event.getY() );
}});
 }
           public static void main(String s[])
    {
       menudemo1 obj=new menudemo1() ;
    obj.setVisible(true);
     obj.setSize(300,300);
    }
    
}