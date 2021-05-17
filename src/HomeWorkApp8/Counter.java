package HomeWorkApp8;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Counter extends JFrame {
    private int value;
    private int x;

    public Counter(int initialValue) {
        setBounds(500, 500, 300, 240);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel(String.valueOf(value));
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setFont(font);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        refreshCounterLabel(counterValueView);

        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);
        decrementButton.setFont(font);

        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        incrementButton.setFont(font);

        JButton resetButton = new JButton("RESET");
        add(resetButton, BorderLayout.PAGE_END);
        resetButton.setFont(font);


        JFormattedTextField input = new JFormattedTextField(
                NumberFormat.getIntegerInstance());
        input.setValue(0);
        add(input, BorderLayout.PAGE_START);
        input.setFont(font);



        decrementButton.addActionListener(actionEvent -> {
            x = Integer.parseInt(input.getText());
            value -= x;
            refreshCounterLabel(counterValueView);
        });

        incrementButton.addActionListener(actionEvent -> {
            x = Integer.parseInt(input.getText());
            value += x;
            refreshCounterLabel(counterValueView);
        });
        resetButton.addActionListener(actionEvent -> {
            value = 0;
            refreshCounterLabel(counterValueView);

        });

        setVisible(true);
    }

    private void refreshCounterLabel(JLabel counterValueView) {
        counterValueView.setText(String.valueOf(value));
    }

    public static void main(String[] args) {
        new Counter(0);
    }

}

