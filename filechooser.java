import java.io.*;
import javax.swing.*;
public class filechooser extends JFileChooser {
    filechooser()
    {
       JFileChooser fileChooser = new JFileChooser();
fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
int result = fileChooser.showOpenDialog(this);
if (result == JFileChooser.APPROVE_OPTION) {
    File selectedFile = fileChooser.getSelectedFile();
    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
      }}
public static void main(String s[])    {
  filechooser obj=new filechooser(); 
}

}