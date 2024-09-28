package org.example;

import javax.swing.*;
import java.awt.*;

public class SelectCharacters extends JPanel {
    private final Image background = new ImageIcon("src/resources/ActorsBackground.png").getImage();
    private final Image character1;
    private final Image character2;
    private final Image character3;
    private int chosenIndexCharacter = 1;
    private int x = 50;
    private final int width = 330;
    private final int height = 340;

    public SelectCharacters() {
        this.character1 = new ImageIcon("src/main/resource/first-character.png").getImage();
        this.character2 = new ImageIcon("src/main/resource/second-character.png").getImage();
        this.character3 = new ImageIcon("src/main/resource/third-character.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(background, 0, 0, getWidth(), getHeight(), null);
        paintCharacter(graphics);
    }

    public void paintCharacter(Graphics graphics) {
        switch (chosenIndexCharacter) {
            case 1:
                graphics.drawImage(this.character1, this.x, 50, width, height, null);
                break;
            case 2:
                graphics.drawImage(this.character2, this.x, 50, width, height, null);
                break;
            case 3:
                graphics.drawImage(this.character3, this.x, 50, width, height, null);
                break;
        }
    }

    public void setChosenIndexCharacter(int chosenCharacter) {
        this.chosenIndexCharacter = chosenCharacter;
        repaint(); // כדי לחדש את הציור
    }
}
