package org.example;


import javax.swing.*;
import java.awt.*;


public class OpenningScreen extends JPanel {
    private final Image background = new ImageIcon("src/resources/1-3f43aeb9.png").getImage();
    private JLabel label;
    private static final int START_X=380;
    private static final int START_Y=250;
    private static final int ELEMENT_WIDTH=200;
    private static final int ELEMENT_HEIGHT=50;

    private static final int LABEL_WIDTH=700;
    private static final int LABEL_HEIGHT=100;
    private static final int START_X2=250;
    private static final int START_Y2=50;
    private JButton button;
    private JLabel label2;


    public OpenningScreen() {
        this.setSize(1000, 600);
        this.setLayout(null);




        this.label = new JLabel("");//
        this.label.setBounds(START_X, START_Y, ELEMENT_WIDTH, ELEMENT_HEIGHT);
        this.label.setFont(new Font("arial" , Font.BOLD, 14));
        this.add(label);


        this.label2 = new JLabel("The Marvel Game");//כותרת
        this.label2.setFont(new Font("ariel" , Font.BOLD, 65));
        this.label2.setForeground(Color.black);
        this.label2.setBounds(START_X2,START_Y2, LABEL_WIDTH, LABEL_HEIGHT);
        this.add(label2);


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