// Mouse motion adapter
// 2082-02-13

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionAdapterExample extends MouseMotionAdapter {
    JFrame f;

    MouseMotionAdapterExample() {
        f = new JFrame("Mouse Motion Adapter");
        f.addMouseMotionListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterExample();
    }
}
