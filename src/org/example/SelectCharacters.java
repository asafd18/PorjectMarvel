package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SelectCharacters extends JPanel {
    private final Image background = new ImageIcon("src/resources/selectCharacterBackground.png").getImage();
    private final Image character1;
    private final Image character2;
    private final Image character3;
    private int chosenIndexCharacter = 1;
    // הקטנת המידות של הדמויות
    private final int characterWidth = 150;
    private final int characterHeight = 150;
    private final Rectangle character1Bounds = new Rectangle(50, 50, characterWidth, characterHeight);
    private final Rectangle character2Bounds = new Rectangle(400, 50, characterWidth, characterHeight);
    private final Rectangle character3Bounds = new Rectangle(750, 50, characterWidth, characterHeight);

    // הגדרת גובה ורוחב של הריבוע שמסביב לדמות הנבחרת
    private final int selectionBorderSize = 10;

    public SelectCharacters() {
        setLayout(null);
        this.character1 = new ImageIcon("src/resources/first-character.png").getImage();
        this.character2 = new ImageIcon("src/resources/second-character.png").getImage();
        this.character3 = new ImageIcon("src/resources/third-character.png").getImage();

        // הוספת מאזין עכבר כדי לזהות לחיצות על הדמויות
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point clickPoint = e.getPoint();

                // בדיקה אם הלחיצה הייתה בתוך הגבולות של אחת הדמויות
                if (character1Bounds.contains(clickPoint)) {
                    setChosenIndexCharacter(1);
                } else if (character2Bounds.contains(clickPoint)) {
                    setChosenIndexCharacter(2);
                } else if (character3Bounds.contains(clickPoint)) {
                    setChosenIndexCharacter(3);
                }

                // כאן אפשר להוסיף מעבר למסך המשחק לאחר בחירת הדמות אם זה רצוי
                System.out.println("Selected Character: " + chosenIndexCharacter);  // הצגת הדמות שנבחרה
            }
        });
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawImage(background, 0, 0, getWidth(), getHeight(), null);
        paintCharacter(graphics);
        drawSelectionBorder(graphics); // הוספת שרטוט של הריבוע סביב הדמות הנבחרת
    }

    public void paintCharacter(Graphics graphics) {
        // ציור הדמויות במיקומים שהוגדרו, עם הגדלים המוקטנים
        graphics.drawImage(this.character1, character1Bounds.x, character1Bounds.y, characterWidth, characterHeight, null);
        graphics.drawImage(this.character2, character2Bounds.x, character2Bounds.y, characterWidth, characterHeight, null);
        graphics.drawImage(this.character3, character3Bounds.x, character3Bounds.y, characterWidth, characterHeight, null);
    }

    // מתודה לציור ריבוע סביב הדמות הנבחרת
    private void drawSelectionBorder(Graphics graphics) {
        Rectangle selectedBounds = null;

        switch (chosenIndexCharacter) {
            case 1:
                selectedBounds = character1Bounds;
                break;
            case 2:
                selectedBounds = character2Bounds;
                break;
            case 3:
                selectedBounds = character3Bounds;
                break;
        }

        if (selectedBounds != null) {
            graphics.setColor(Color.RED);  // צבע הריבוע
            graphics.drawRect(selectedBounds.x - selectionBorderSize, selectedBounds.y - selectionBorderSize,
                    selectedBounds.width + 2 * selectionBorderSize,
                    selectedBounds.height + 2 * selectionBorderSize);
        }
    }

    public void setChosenIndexCharacter(int chosenCharacter) {
        this.chosenIndexCharacter = chosenCharacter;
        repaint();  // רענון המסך לאחר בחירת הדמות
    }
}
