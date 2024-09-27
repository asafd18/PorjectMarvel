package org.example;

import javax.swing.*;
import java.awt.*;

public class OpenningScreen extends JPanel {
    private final Image background = new ImageIcon("src/resources/MARVEL.png").getImage();// תמונת פתיחה של המשחק.
    private JLabel label;
    private static final int START_X = 300; // מיקום הכפתור ציר ה-X
    private static final int START_Y = 300; // מיקום הכפתור ציר ה- Y
    private static final int ELEMENT_WIDTH = 300; // רוחב כפתור
    private static final int ELEMENT_HEIGHT = 60; // אורך של הכפתור
    private JButton button;

    public OpenningScreen() {
        this.setSize(1000, 600);
        this.setLayout(null);

        // הגדרת הכותרת
        this.label = new JLabel("Welcome to Marvel Game");
        this.label.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        this.label.setFont(new Font("arial", Font.BOLD, 24));
        this.label.setForeground(Color.red); // צביעת הכותרת ב
        this.add(label);

        // הגדרת כפתור
        button = new JButton("Enter");
        button.setFont(new Font("arial", Font.BOLD, 24));
        button.setBounds(START_X, START_Y + ELEMENT_HEIGHT, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        button.setForeground(Color.YELLOW); // צביעת הטקסט של הכפתור בצהוב
        button.setBackground(Color.black); // צבע רקע של הכפתור (לא חובה)
        this.add(button);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(this.background, 0, 0, 1000, 600, null);
    }

    public JButton getButton() {
        return button;
    }
}
