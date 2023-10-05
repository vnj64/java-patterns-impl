package main.factory_method.buttons;

import main.factory_method.buttons.Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Реализация уникальной кнопки для ОС.
public class WindowsButton implements Button {
    JPanel jPanel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton jButton;

    public void render() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
        jPanel.add(label);
        onClick();
        jPanel.add(jButton);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();
    }
    public void onClick() {
        jButton = new JButton("Exit");
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
