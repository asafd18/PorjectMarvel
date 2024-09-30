package org.example;

import javax.swing.*;
import java.awt.*;

public class Instructions extends JPanel {
    private final Image background = new ImageIcon("src/main/resources/Instruction_background.png").getImage();
    private final int xOfBackground = 0;  // שינינו ל-int
    private final int yOfBackground = 0;  // שינינו ל-int
    private final JButton backButton;

    public Instructions() {
        // הגדרה ידנית של גודל הפאנל
        this.setSize(1000, 600);
        this.setLayout(null);

        this.backButton = new JButton("Back");
        this.backButton.setBounds(10, 500, 100, 50); // מיקום הגיוני יותר לכפתור
        this.backButton.setFont(new Font("Arial", Font.BOLD, 20));
        add(this.backButton);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        // הדפסת בדיקה אם התמונה נטענת כראוי
        System.out.println("Image width: " + background.getWidth(null) + " height: " + background.getHeight(null));

        // בדיקת התמונה לפני הציור
        if (background != null) {
            graphics.drawImage(this.background, this.xOfBackground, this.yOfBackground, getWidth(), getHeight(), null);
        }
    }

    public JButton getBackButton() {
        return this.backButton;
    }

    public void showWindow() {
        this.setVisible(true);
    }
}
