package org.example;

import javax.swing.*;
import java.awt.*;

public class OptionsScreen extends JPanel {
    private JButton gameScene;
    private JButton instructions;
    private JButton garage;
    private JButton exitFromGame;
    private final Image background;

    public OptionsScreen() {
        setLayout(null);

        this.background = new ImageIcon("src/resources/Actor.png").getImage();


        this.gameScene = new JButton("Start Play");
        this.gameScene.setBounds(10, 550, 150, 50);
        this.gameScene.setFont(new Font("Arial", Font.BOLD, 25));
// הגדרת צבעים
        this.gameScene.setBackground(Color.WHITE); // צבע רקע לבן
        this.gameScene.setForeground(Color.BLACK); // צבע טקסט שחור
        this.gameScene.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // הוספת גבול לכפתור
        this.add(gameScene);



        this.garage = new JButton("Character");
        this.garage.setBounds(190, 550, 150, 50);
        this.garage.setFont(new Font("Arial", Font.BOLD, 25));
// הגדרת צבעים
        this.garage.setBackground(Color.WHITE); // צבע רקע לבן
        this.garage.setForeground(Color.BLACK); // צבע טקסט שחור
        this.garage.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // הוספת גבול לכפתור
        this.add(garage);



        // כפתור "Instructions"
        this.instructions = new JButton("Instructions");
        this.instructions.setBounds(375, 550, 180, 50);
        this.instructions.setFont(new Font("Arial", Font.BOLD, 25));
        //הגדרת צבע
        this.instructions.setBackground(Color.WHITE); // צבע רקע לבן
        this.instructions.setForeground(Color.BLACK); // צבע טקסט שחור
        this.instructions.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // הוספת גבול
        this.add(instructions);


        // כפתור "Exit"
        this.exitFromGame = new JButton("Exit");
        this.exitFromGame.setBounds(580, 550, 150, 50);
        this.exitFromGame.setFont(new Font("Arial", Font.BOLD, 25));
        //הגדרת צבע
        this.exitFromGame.setBackground(Color.WHITE); // צבע רקע לבן
        this.exitFromGame.setForeground(Color.BLACK); // צבע טקסט שחור
        this.exitFromGame.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // הוספת גבול
        this.exitFromGame.addActionListener(e -> System.exit(0));
        this.add(exitFromGame);



        // Action listener for the Select Character button to switch to character selection screen
        garage.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.setContentPane(new SelectCharacters());  // Transition to SelectCharacters screen
            frame.revalidate();  // Revalidate the frame to apply the changes
            frame.repaint();  // Repaint the frame to refresh the UI
        });

        // Action listener for Instructions button to open instructions window
        instructions.addActionListener(e -> openInstructionsWindow());  // קריאה לפונקציה שמציגה את חלון ההוראות
    }






    // יצירת חלון ההוראות
    private void openInstructionsWindow() {
        // יצירת JFrame חדש עבור חלון ההוראות
        JFrame instructionsFrame = new JFrame("Game Instructions");
        instructionsFrame.setSize(1000, 650);  // הגדלת גודל החלון ל-800x600
        instructionsFrame.setResizable(false);  // מונע שינוי גודל החלון

        // יצירת JPanel עם תמונת רקע
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("src/resources/ins.png");  // תמונת הרקע
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(null);
        backgroundPanel.setPreferredSize(new Dimension(600, 620));  // הגדרת גודל ה-JPanel

        // יצירת כפתור חזרה (Close)
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(450, 550, 100, 40);  // מיקום הכפתור במרכז התחתון
        closeButton.setFont(new Font("Arial", Font.BOLD, 16));
        // הגדרת צבע
        closeButton.setBackground(Color.WHITE); // צבע רקע לבן
        closeButton.setForeground(Color.BLACK); // צבע טקסט שחור
        closeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // הוספת גבול
        closeButton.addActionListener(e -> instructionsFrame.dispose());  // סגירת החלון בלחיצה

        // הוספת הכפתור ל-JPanel
        backgroundPanel.add(closeButton);

        // הוספת JPanel לחלון
        instructionsFrame.add(backgroundPanel);
        instructionsFrame.pack();  // הכוונת ה-JFrame לפי התוכן

        // הגדרת מיקום החלון במרכז המסך
        instructionsFrame.setLocationRelativeTo(null);
        instructionsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // סוגר רק את חלון ההוראות
        instructionsFrame.setVisible(true);  // הצגת החלון
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null); // ציור הרקע
    }
}
