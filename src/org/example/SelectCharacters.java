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

    private JButton selectCharacter1;
    private JButton selectCharacter2;
    private JButton selectCharacter3;

    public SelectCharacters() {
        setLayout(null);
        this.character1 = new ImageIcon("src/main/resource/first-character.png").getImage();
        this.character2 = new ImageIcon("src/main/resource/second-character.png").getImage();
        this.character3 = new ImageIcon("src/main/resource/third-character.png").getImage();

        selectCharacter1 = new JButton("Select Character 1");
        selectCharacter1.setBounds(50,400,150,30);
        this.add(selectCharacter1);

        selectCharacter2 = new JButton("Select Character 2");
        selectCharacter2.setBounds(50,400,150,30);
        this.add(selectCharacter2);

        selectCharacter3 = new JButton("Select Character 3");
        selectCharacter3.setBounds(50,400,150,30);
        this.add(selectCharacter3);

        selectCharacter1.addActionListener(e -> setChosenIndexCharacter(1));
        selectCharacter2.addActionListener(e -> setChosenIndexCharacter(2));
        selectCharacter3.addActionListener(e -> setChosenIndexCharacter(3));
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
