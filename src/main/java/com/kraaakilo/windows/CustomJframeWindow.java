package com.kraaakilo.windows;

import javax.swing.*;

public class CustomJframeWindow extends JFrame {
    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    private JFrame window;
    public CustomJframeWindow(){
        this.window = new JFrame();
        this.window.setResizable(true);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.window.setLocationRelativeTo(null);
        this.window.setTitle("Kraaakilo Desktop App");
        this.window.setSize(300,300);
        this.window.setVisible(true);
    }
}
