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
        this.add(gameScene);

        this.garage = new JButton("Select Character");
        this.garage.setBounds(190, 550, 150, 50);
        this.garage.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(garage);

        this.instructions = new JButton("Instructions");
        this.instructions.setBounds(375, 550, 180, 50);
        this.instructions.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(instructions);

        this.exitFromGame = new JButton("Exit");
        this.exitFromGame.setBounds(580, 550, 150, 50);
        this.exitFromGame.setFont(new Font("Arial", Font.BOLD, 25));
        this.exitFromGame.addActionListener(e -> System.exit(0));
        this.add(exitFromGame);

        // Action listener for the Select Character button to switch to character selection screen
        garage.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.setContentPane(new SelectCharacters());  // Transition to SelectCharacters screen
            frame.revalidate();  // Revalidate the frame to apply the changes
            frame.repaint();  // Repaint the frame to refresh the UI
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null); // ציור הרקע
    }
}
