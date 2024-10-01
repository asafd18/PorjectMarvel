package org.example;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class OpenningScreen extends JPanel {
    private final Image background = new ImageIcon("src/resources/1-3f43aeb9.png").getImage();
    private JLabel label;
    private static final int START_X = 380;
    private static final int START_Y = 250; // מיקום התווית
    private static final int ELEMENT_WIDTH = 200;
    private static final int ELEMENT_HEIGHT = 50;

    private JButton button;
    private JLabel label2;

    public OpenningScreen() {
        this.setSize(1000, 600);
        this.setLayout(null);

        this.label = new JLabel("");//
        this.label.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        this.label.setFont(new Font("arial", Font.BOLD, 14));
        this.add(label);

        // יצירת כותרת עם צבע צהוב ומיקום למעלה במרכז
        this.label2 = new JLabel("Marvel-Game", SwingConstants.CENTER); // טקסט במרכז הכותרת
        this.label2.setFont(new Font("ariel", Font.BOLD, 80));
        this.label2.setForeground(Color.white); // צביעת הטקסט בלבן

        // יצירת צבע אדום
        Color transparentRed = new Color(255, 0, 0);

        // הגדרת הרקע האדום לכותרת
        this.label2.setBackground(transparentRed);
        this.label2.setOpaque(true);

        // הוספת מסגרת בצבע שחור חצי שקוף לכותרת
        Color transparentBlack = new Color(0, 0, 0, 200); // צבע שחור שקוף
        this.label2.setBorder(new MatteBorder(5, 5, 5, 5, transparentBlack)); // מסגרת שחורה בעובי 5 פיקסלים

        // קבלת הגודל המועדף של הכותרת לפי הטקסט
        Dimension label2Size = this.label2.getPreferredSize();

        // חישוב מיקום הכותרת במרכז החלון לפי הגודל המועדף שלה
        int label2_X = (this.getWidth() - label2Size.width) / 2; // מיקום בציר X - מרכז החלון
        int label2_Y = 50; // מיקום בציר Y - למעלה

        // עדכון המיקום והגודל של הכותרת בהתאם לטקסט
        this.label2.setBounds(label2_X, label2_Y, label2Size.width, label2Size.height);
        this.add(label2);

        // הגדרת כפתור והורדתו למטה
        button = new JButton("Enter");
        button.setBounds(START_X, START_Y + ELEMENT_HEIGHT + 150, ELEMENT_WIDTH, ELEMENT_HEIGHT); // הוספנו 150 פיקסלים למטה
        button.setForeground(Color.black); // צביעת הטקסט של הכפתור
        button.setBackground(Color.white); // צבע רקע של הכפתור

        // הוספת מסגרת שקופה לכפתור
        button.setBorder(new MatteBorder(3, 3, 3, 3, transparentBlack)); // מסגרת שחורה שקופה בעובי 3 פיקסלים
        this.add(button);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(this.background, 0, 0, getWidth(), getHeight(), null);
    }

    public JButton getButton() {
        return button;
    }
}
