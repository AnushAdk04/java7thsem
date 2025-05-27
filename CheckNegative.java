// Negative number check
// 2082-02-13

import java.awt.event.*;
import javax.swing.*;
public class CheckNegative
{
CheckNegative()
{
JFrame jframe=new JFrame("Checking for Positive or Negative");
JLabel lblAge=new JLabel("Enter a Number:");
lblAge.setBounds(20, 30, 150, 20);
jframe.add(lblAge);
JTextField txtAge = new JTextField();
txtAge.setBounds(150, 30, 150, 20);
jframe.add(txtAge);
JButton btnCheck=new JButton("Check");
btnCheck.setBounds(100, 60, 80, 20);
jframe.add(btnCheck);
JLabel lblResult=new JLabel("");
lblResult.setBounds(100, 85, 150, 20);
jframe.add(lblResult);
jframe.setLayout(null);
jframe.setSize(400, 500);
jframe.setVisible(true);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btnCheck.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(txtAge.getText());
if(a>0)
lblResult.setText("Positive Number");
else if(a<0)
lblResult.setText("Negative Number");
else
lblResult.setText("Zero");
}
}
);
}
public static void main(String args[])
{
new CheckNegative();
}
}