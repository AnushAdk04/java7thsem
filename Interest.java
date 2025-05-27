// calculate interest
// 2082-02-13

import java.awt.event.*;
import javax.swing.*;
public class Interest
{
Interest()
{
JFrame jframe=new JFrame("Simple Interest");
JLabel lblPrincipal=new JLabel("Enter Principal");
lblPrincipal.setBounds(20, 30, 150, 20);
jframe.add(lblPrincipal);
JTextField txtPrincipal = new JTextField();
txtPrincipal.setBounds(150, 30, 150, 20);
jframe.add(txtPrincipal);
JLabel lblTime=new JLabel("Enter time");
lblTime.setBounds(20, 55, 150, 20);
jframe.add(lblTime);
JTextField txtTime=new JTextField();
txtTime.setBounds(150, 55, 150, 20);
jframe.add(txtTime);
JLabel lblRate=new JLabel("Enter Rate");
lblRate.setBounds(20, 80, 150, 20);
jframe.add(lblRate);
JTextField txtRate=new JTextField();
txtRate.setBounds(150, 80, 150, 20);
jframe.add(txtRate);
JLabel lblIntrest=new JLabel("Calculate Interest");
lblIntrest.setBounds(20,105 ,150,20);
jframe.add(lblIntrest);
JTextField txtIntrest=new JTextField();
txtIntrest.setBounds(150, 105, 150,20);
jframe.add(txtIntrest);
JButton btnAdd=new JButton("Interest");
btnAdd.setBounds(50, 130, 80, 20);
jframe.add(btnAdd);
JButton btnCancel=new JButton("Cancel");
btnCancel.setBounds(170, 130, 80, 20);
jframe.add(btnCancel);
jframe.setLayout(null);
jframe.setSize(400, 200);
jframe.setVisible(true);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
btnAdd.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
float p=Float.parseFloat(txtPrincipal.getText());
float t=Float.parseFloat(txtRate.getText());
float r=Float.parseFloat(txtTime.getText());
float si=(p*t*r)/100;
txtIntrest.setText(" "+si);
}
}
);
btnCancel.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
txtPrincipal.setText(null);
txtRate.setText(null);
txtTime.setText(null);
txtIntrest.setText(null);
}
}
);
}
public static void main(String args[])
{
new Interest();
}
}