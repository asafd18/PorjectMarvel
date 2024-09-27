package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Window extends JFrame {
    ImageIcon icon = new ImageIcon("Resource/resources/MARVEL.png");



    public Window() {
        this.setVisible(true);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Marvel");

        OpenningScreen openningScreen = new OpenningScreen();
        this.add(openningScreen);
        openningScreen.setVisible(true);




        openningScreen.getButton().addActionListener(e->{
            openningScreen.setVisible(false);
            this.setVisible(true);
        });





    }

    public void showWindow(){
        this.setVisible(true);
    }
}