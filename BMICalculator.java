import javax.swing.*;
import java.awt.event.*;

public class BMICalculator {
    public static void main(String[] args) {
        JFrame window = new JFrame("BMI Calculator");
        JLabel label = new JLabel("Enter Weight(KG)");
        label.setBounds(40, 40, 200, 20);
        window.add(label);
        JLabel label1 = new JLabel("Enter Height(M)");
        label1.setBounds(40, 100, 250, 20);
        window.add(label1);
        JLabel label2 = new JLabel("");
        label2.setBounds(90, 180, 200, 20);
        window.add(label2);
        JTextField t1, t2;
        t1 = new JTextField("");
        t1.setBounds(40, 60, 200, 30);
        window.add(t1);
        t2 = new JTextField("");
        t2.setBounds(40, 120, 200, 30);
        JButton button = new JButton("Calculate BMI");
        button.setBounds(60, 220, 150, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double height = Double.parseDouble(t2.getText());
                Double weight = Double.parseDouble(t1.getText());
                Double BMI = weight / (height * height);
                String message;
                if(BMI < 18.5) {
                    message=" You are underweight";
                }else if (BMI < 25) {
                    message=" You are normal";
                }else if (BMI < 30) {
                    message=" You are overweight";
                }else {
                    message=" You are obese";
                }
                label2.setText(String.valueOf(Math.round(BMI)) + message);
            }
        });
        window.add(button);
        window.add(t2);
        window.setLayout(null);
        window.setSize(300, 400);
        window.setVisible(true);
    }
}
