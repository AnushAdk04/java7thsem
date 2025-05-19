// WAP TO generate frame in java
// 2082-02-05

import javax.swing.*;
public class FrameByiheritance extends JFrame{
    JFrame f;
    FrameByiheritance()
    {
        setSize(700,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] arrgs){
        new FrameByiheritance();
    }
}