package org.example;


import javax.swing.*;
import java.awt.*;


public class OpenningScreen extends JPanel {
    private final Image background = new ImageIcon("src/main/resources/opening screen picture (1).png").getImage();
    private JLabel label;
    private static final int START_X=380;
    private static final int START_Y=250;
    private static final int ELEMENT_WIDTH=200;
    private static final int ELEMENT_HEIGHT=50;
    private JButton button;


    public OpenningScreen() {
        this.setSize(1000, 600);
        this.setLayout(null);




        this.label = new JLabel("Welcome to Marvel Game");//הגדרת הכותרת
        this.label.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        this.label.setFont(new Font("arial" , Font.BOLD, 14));
        this.add(label);


        button = new JButton("Enter");
        button.setBounds(START_X, START_Y+ELEMENT_HEIGHT, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        this.add(button);

    }
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.drawImage(this.background,  0, 0, 1000,600,null);
    }

    public JButton getButton() {
        return button;
    }
}