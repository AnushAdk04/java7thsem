// Profit and Loss calculator
// 2082-02-12

import java.awt.event.*;
import javax.swing.*;

public class ProfitLossCalculator {
    ProfitLossCalculator() {
        JFrame jframe = new JFrame("Profit and Loss Calculator");

        JLabel lblCP = new JLabel("Cost Price:");
        lblCP.setBounds(20, 30, 120, 20);
        jframe.add(lblCP);

        JTextField txtCP = new JTextField();
        txtCP.setBounds(150, 30, 150, 20);
        jframe.add(txtCP);

        JLabel lblSP = new JLabel("Selling Price:");
        lblSP.setBounds(20, 60, 120, 20);
        jframe.add(lblSP);

        JTextField txtSP = new JTextField();
        txtSP.setBounds(150, 60, 150, 20);
        jframe.add(txtSP);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(20, 90, 120, 20);
        jframe.add(lblResult);

        JTextField txtResult = new JTextField();
        txtResult.setBounds(150, 90, 200, 20);
        txtResult.setEditable(false);
        jframe.add(txtResult);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(50, 130, 100, 25);
        jframe.add(btnCalculate);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(180, 130, 100, 25);
        jframe.add(btnClear);

        jframe.setLayout(null);
        jframe.setSize(400, 220);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double cp = Double.parseDouble(txtCP.getText());
                    double sp = Double.parseDouble(txtSP.getText());

                    if (cp < 0 || sp < 0) {
                        JOptionPane.showMessageDialog(jframe, "Cost Price and Selling Price must be non-negative.");
                        return;
                    }

                    if (sp > cp) {
                        double profit = sp - cp;
                        txtResult.setText("Profit: " + profit);
                    } else if (cp > sp) {
                        double loss = cp - sp;
                        txtResult.setText("Loss: " + loss);
                    } else {
                        txtResult.setText("No Profit, No Loss.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(jframe, "Please enter valid numeric values.");
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                txtCP.setText("");
                txtSP.setText("");
                txtResult.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new ProfitLossCalculator();
    }
}
