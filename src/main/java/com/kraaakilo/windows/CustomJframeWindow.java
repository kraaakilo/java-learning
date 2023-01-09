package com.kraaakilo.windows;

import javax.swing.*;

public class CustomJframeWindow extends JFrame {
    private JPanel panel;

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    private JFrame window = new JFrame();

    public CustomJframeWindow(JPanel panel) {
        this.window.setContentPane(panel);
        this.window.setResizable(false);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setLocationRelativeTo(null);
        this.window.setTitle("Kraaakilo Desktop App");
        this.window.setSize(800, 600);
        this.window.setVisible(true);
    }
}
