package reyanproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Javaproject extends JFrame implements ActionListener {

 
    private JTextField display;
    private JLabel subDisplay;
    private double num1 = 0, num2 = 0, result = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

   
    private final String[] buttonLabels = {
        "C", "√", "x²", "÷",
        "sin", "7", "8", "9", "×",
        "cos", "4", "5", "6", "-",
        "tan", "1", "2", "3", "+",
        "log", "π", "0", ".", "="
    };

    public Javaproject() {
       
        setTitle("Scientific Calculator");
        setSize(420, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(28, 28, 30)); 

        
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout());
        displayPanel.setBackground(new Color(28, 28, 30));
        displayPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        subDisplay = new JLabel(" ", SwingConstants.RIGHT);
        subDisplay.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subDisplay.setForeground(new Color(150, 150, 150)); 
        displayPanel.add(subDisplay, BorderLayout.NORTH);

        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Segoe UI", Font.BOLD, 36));
        display.setBackground(new Color(38, 38, 41)); 
        display.setForeground(Color.WHITE); 
        display.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(50, 50, 54), 1),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        displayPanel.add(display, BorderLayout.CENTER);
        add(displayPanel, BorderLayout.NORTH);

       
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 4, 10, 10)); 
        buttonsPanel.setBackground(new Color(28, 28, 30));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

       
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Segoe UI", Font.BOLD, 18)); 
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            
            button.setContentAreaFilled(true); 

          
            if (label.equals("C")) {
                button.setBackground(Color.RED); 
                button.setForeground(Color.WHITE);
            } 
            else if (label.equals("=") || label.equals(".") || label.equals("0") || "+-×÷√x²sincos-tanlogπ".contains(label)) {
              
                button.setBackground(new Color(44, 44, 46));   
                button.setForeground(new Color(10, 132, 255)); 
            } 
            else {
                
                button.setBackground(new Color(58, 58, 62));   
                button.setForeground(Color.WHITE);             
            }

            button.addActionListener(this);
            buttonsPanel.add(button);
        }

        add(buttonsPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("0");
            subDisplay.setText(" ");
            num1 = num2 = result = 0;
            operator = "";
            return;
        }

        if (command.equals("π")) {
            display.setText(String.valueOf(Math.PI));
            return;
        }

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            if (display.getText().equals("0") || isOperatorClicked) {
                display.setText(command);
                isOperatorClicked = false;
            } else {
                if (command.equals(".") && display.getText().contains(".")) return;
                display.setText(display.getText() + command);
            }
            return;
        }

        if ("√x²sincos-tanlog".contains(command)) {
            num1 = Double.parseDouble(display.getText());
            switch (command) {
                case "√" -> result = Math.sqrt(num1);
                case "x²" -> result = Math.pow(num1, 2);
                case "sin" -> result = Math.sin(Math.toRadians(num1));
                case "cos" -> result = Math.cos(Math.toRadians(num1));
                case "tan" -> result = Math.tan(Math.toRadians(num1));
                case "log" -> result = Math.log10(num1);
            }
            display.setText(formatResult(result));
            subDisplay.setText(command + "(" + num1 + ")");
            isOperatorClicked = true;
            return;
        }

        if ("+-×÷".contains(command)) {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            subDisplay.setText(formatResult(num1) + " " + operator);
            isOperatorClicked = true;
            return;
        }

        if (command.equals("=")) {
            if (operator.isEmpty()) return;
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "×" -> result = num1 * num2;
                case "÷" -> {
                    if (num2 == 0) {
                        display.setText("Error");
                        subDisplay.setText("Cannot divide by zero");
                        operator = "";
                        return;
                    }
                    result = num1 / num2;
                }
            }
            subDisplay.setText(formatResult(num1) + " " + operator + " " + formatResult(num2) + " =");
            display.setText(formatResult(result));
            operator = "";
            isOperatorClicked = true;
        }
    }

    private String formatResult(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }

    public static void main(String[] args) {
        
        try {
            
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            new Javaproject().setVisible(true);
        });
    }
}