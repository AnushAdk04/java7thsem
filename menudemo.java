// Menu Demo
// 2082-02-12

import javax.swing.*;

public class menudemo extends JFrame {
    menudemo() {
        super("Menu Demo");
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        fileMenu.addSeparator();
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('X');  
        fileMenu.add(exitItem);
        JMenu editMenu = new JMenu("Edit");  
        editMenu.setMnemonic('E');
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.setMnemonic('C');  
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.setMnemonic('P');  
        editMenu.add(pasteItem);
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
        bar.add(editMenu);
    }

    public static void main(String[] args) {
        menudemo obj = new menudemo();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(300, 300);
    }
}