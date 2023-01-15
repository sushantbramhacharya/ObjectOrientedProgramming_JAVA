import java.awt.*;
import java.awt.event.*;

public class TicTacToe {
    static Button button1;
    static Button button2;
    static Button button3;
    static Button button4;
    static Button button5;
    static Button button6;
    static Button button7;
    static Button button8;
    static Button button9;
    static Button reset;
    static Label label;
    static int count = 1;

    public static void main(String[] args) {
        Frame window = new Frame("TicTacToe");

        // 1st
        button1 = new Button("");
        button1.setBounds(40, 40, 50, 50);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button1);
            }
        });
        window.add(button1);
        // 2nd
        button2 = new Button("");
        button2.setBounds(130, 40, 50, 50);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button2);
            }
        });
        window.add(button2);
        // 3rd
        button3 = new Button("");
        button3.setBounds(220, 40, 50, 50);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button3);
            }
        });
        window.add(button3);
        // 4th
        button4 = new Button("");
        button4.setBounds(40, 130, 50, 50);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button4);
            }
        });
        window.add(button4);
        // 5th
        button5 = new Button("");
        button5.setBounds(130, 130, 50, 50);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button5);
            }
        });
        window.add(button5);
        // 6th
        button6 = new Button("");
        button6.setBounds(220, 130, 50, 50);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button6);
            }
        });
        window.add(button6);
        // 7th
        button7 = new Button("");
        button7.setBounds(40, 220, 50, 50);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button7);
            }
        });
        window.add(button7);
        // 8th
        button8 = new Button("");
        button8.setBounds(130, 220, 50, 50);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button8);
            }
        });
        window.add(button8);
        // 9th
        button9 = new Button("");
        button9.setBounds(220, 220, 50, 50);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClick(button9);
            }
        });
        window.add(button9);
        // Label
        label = new Label("");
        label.setBounds(110, 300, 200, 20);
        window.add(label);
        reset = new Button("Reset");
        reset.setBounds(110, 330, 100, 20);
        window.add(reset);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 1;

                button1.setLabel("");
                button2.setLabel("");
                button3.setLabel("");
                button4.setLabel("");
                button5.setLabel("");
                button6.setLabel("");
                button7.setLabel("");
                button8.setLabel("");
                button9.setLabel("");

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);

                label.setText("");
            }
        });

        window.setLayout(null);
        window.setSize(320, 400);
        window.setVisible(true);
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                window.dispose();
            }
        });
        window.setResizable(false);

    }

    static void won(Button button) {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        label.setText(button.getLabel() + " Won the Game !");
    }

    static void buttonClick(Button button) {
        if (button.getLabel() == "") {
            if (count % 2 == 0) {
                button.setLabel("X");
            } else {
                button.setLabel("O");
            }
            count++;
        }
        if (button1.getLabel() != "" && button2.getLabel() != "" && button3.getLabel() != "") {
            if (button1.getLabel() == button2.getLabel() && button2.getLabel() == button3.getLabel()) {
                won(button1);
            }
        }
        if (button4.getLabel() != "" && button5.getLabel() != "" && button6.getLabel() != "") {
            if (button4.getLabel() == button5.getLabel() && button5.getLabel() == button6.getLabel()) {
                won(button4);
            }
        }
        if (button7.getLabel() != "" && button8.getLabel() != "" && button9.getLabel() != "") {
            if (button7.getLabel() == button8.getLabel() && button8.getLabel() == button9.getLabel()) {
                won(button7);
            }
        }
        if (button1.getLabel() != "" && button4.getLabel() != "" && button7.getLabel() != "") {
            if (button1.getLabel() == button4.getLabel() && button4.getLabel() == button7.getLabel()) {
                won(button1);
            }
        }
        if (button1.getLabel() != "" && button5.getLabel() != "" && button9.getLabel() != "") {
            if (button1.getLabel() == button5.getLabel() && button5.getLabel() == button9.getLabel()) {
                won(button1);
            }
        }
        if (button2.getLabel() != "" && button5.getLabel() != "" && button8.getLabel() != "") {
            if (button2.getLabel() == button5.getLabel() && button5.getLabel() == button8.getLabel()) {
                won(button2);
            }
        }
        if (button3.getLabel() != "" && button5.getLabel() != "" && button7.getLabel() != "") {
            if (button3.getLabel() == button5.getLabel() && button5.getLabel() == button7.getLabel()) {
                won(button3);
            }
        }
        if (button3.getLabel() != "" && button6.getLabel() != "" && button9.getLabel() != "") {
            if (button3.getLabel() == button6.getLabel() && button6.getLabel() == button9.getLabel()) {
                won(button4);
            }
        }
    }
}