package com.kraaakilo;
import com.kraaakilo.windows.CustomJframeWindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        CustomJframeWindow window = new CustomJframeWindow(panel);

    }
}