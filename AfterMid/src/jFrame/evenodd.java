package jFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class evenodd {

    public static void main(String[] args) {
        JFrame f1 = new JFrame("Even/odd");
        JTextField t1 = new JTextField(4);
        JLabel ab = new JLabel("Enter your number:");
        JButton b1 = new JButton("Check");
        JLabel r1 = new JLabel("Result");
        f1.add(ab);
        f1.add(t1);
        f1.add(b1);
        f1.add(r1);
        b1.addActionListener(e -> {
            try {
                int n = Integer.parseInt(t1.getText());
                if (n % 2 == 0) {
                    r1.setText("Even");
                    f1.getContentPane().setBackground(UIManager.getColor("Panel.background"));
                } else {
                    r1.setText("Odd");
                    f1.getContentPane().setBackground(Color.pink);
                }
            } catch (NumberFormatException ex) {
                r1.setText("Invalid Input!");
            }
        });
        f1.setSize(300, 500);
        f1.setLayout(new FlowLayout());
        f1.setVisible(true);
    }
}
