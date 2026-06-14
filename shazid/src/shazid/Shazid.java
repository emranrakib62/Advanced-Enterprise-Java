/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shazid;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shazid extends JFrame implements ActionListener {

    // UI Components
    private JTextField weightInput, heightInput, display;
    private JLabel subDisplay;
    private JButton calculateBtn, clearBtn;

    public Shazid() {
        // Frame Settings
        setTitle("BMI Calculator");
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(28, 28, 30)); 

        // 1. Display Panel (Top) - ফলাফল দেখানোর জন্য
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new BorderLayout(5, 5));
        displayPanel.setBackground(new Color(28, 28, 30));
        displayPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        subDisplay = new JLabel("Enter your details below", SwingConstants.CENTER);
        subDisplay.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subDisplay.setForeground(new Color(150, 150, 150)); 
        displayPanel.add(subDisplay, BorderLayout.NORTH);

        display = new JTextField("0.0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.CENTER);
        display.setFont(new Font("Segoe UI", Font.BOLD, 44));
        display.setBackground(new Color(38, 38, 41)); 
        display.setForeground(Color.WHITE); 
        display.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(50, 50, 54), 1),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        displayPanel.add(display, BorderLayout.CENTER);
        add(displayPanel, BorderLayout.NORTH);

        // 2. Input Panel (Center) - ওজন ও উচ্চতা ইনপুট নেওয়ার জন্য
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 1, 10, 10));
        inputPanel.setBackground(new Color(28, 28, 30));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));

        // Weight Input Elements
        JLabel weightLabel = new JLabel("Weight (kg):", SwingConstants.LEFT);
        weightLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        weightLabel.setForeground(new Color(10, 132, 255));
        
        weightInput = new JTextField();
        customizeInputField(weightInput);

        // Height Input Elements
        JLabel heightLabel = new JLabel("Height (cm):", SwingConstants.LEFT);
        heightLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        heightLabel.setForeground(new Color(10, 132, 255));

        heightInput = new JTextField();
        customizeInputField(heightInput);

        inputPanel.add(weightLabel);
        inputPanel.add(weightInput);
        inputPanel.add(heightLabel);
        inputPanel.add(heightInput);
        add(inputPanel, BorderLayout.CENTER);

        // 3. Buttons Panel (Bottom) - ক্যালকুলেট এবং ক্লিয়ার বাটন
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new GridLayout(1, 2, 15, 15));
        actionPanel.setBackground(new Color(28, 28, 30));
        actionPanel.setBorder(BorderFactory.createEmptyBorder(10, 25, 25, 25));

        clearBtn = new JButton("Clear");
        customizeButton(clearBtn, Color.RED, Color.WHITE);

        calculateBtn = new JButton("Calculate BMI");
        customizeButton(calculateBtn, new Color(44, 44, 46), new Color(10, 132, 255));

        actionPanel.add(clearBtn);
        actionPanel.add(calculateBtn);
        add(actionPanel, BorderLayout.SOUTH);
    }

    // ইনপুট ফিল্ডের স্টাইল কাস্টমাইজেশন মেথড
    private void customizeInputField(JTextField field) {
        field.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        field.setBackground(new Color(44, 44, 46));
        field.setForeground(Color.WHITE);
        field.setCaretColor(Color.WHITE);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(68, 68, 70), 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
    }

    // বাটনের স্টাইল কাস্টমাইজেশন মেথড
    private void customizeButton(JButton button, Color bg, Color fg) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setContentAreaFilled(true);
        button.setBackground(bg);
        button.setForeground(fg);
        button.setPreferredSize(new Dimension(0, 50));
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearBtn) {
            weightInput.setText("");
            heightInput.setText("");
            display.setText("0.0");
            display.setForeground(Color.WHITE);
            subDisplay.setText("Enter your details below");
            return;
        }

        if (e.getSource() == calculateBtn) {
            try {
                String weightStr = weightInput.getText().trim();
                String heightStr = heightInput.getText().trim();

                if (weightStr.isEmpty() || heightStr.isEmpty()) {
                    subDisplay.setText("Please fill in all fields!");
                    subDisplay.setForeground(Color.ORANGE);
                    return;
                }

                double weight = Double.parseDouble(weightStr);
                double heightInCm = Double.parseDouble(heightStr);

                if (weight <= 0 || heightInCm <= 0) {
                    subDisplay.setText("Values must be greater than zero!");
                    subDisplay.setForeground(Color.ORANGE);
                    return;
                }

                // উচ্চতাকে সেন্টিমিটার থেকে মিটারে রূপান্তর ($BMI = kg / m^2$)
                double heightInMeter = heightInCm / 100.0;
                double bmi = weight / (heightInMeter * heightInMeter);

                // ফলাফল প্রদর্শন ও কন্ডিশন চেক
                display.setText(String.format("%.1f", bmi));
                
                if (bmi < 18.5) {
                    subDisplay.setText("Underweight 😟");
                    display.setForeground(new Color(255, 69, 0)); // লালচে কমলা
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    subDisplay.setText("Normal Weight  Normal (Healthy) 😊");
                    display.setForeground(new Color(50, 215, 75)); // চমৎকার সবুজ
                } else if (bmi >= 25 && bmi < 29.9) {
                    subDisplay.setText("Overweight 😐");
                    display.setForeground(new Color(255, 159, 10)); // কমলা
                } else {
                    subDisplay.setText("Obesity 🚨");
                    display.setForeground(Color.RED); // লাল
                }
                subDisplay.setForeground(new Color(150, 150, 150));

            } catch (NumberFormatException ex) {
                subDisplay.setText("Invalid Input! Numbers only.");
                subDisplay.setForeground(Color.RED);
                display.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            new Shazid().setVisible(true);
        });
    }
}
