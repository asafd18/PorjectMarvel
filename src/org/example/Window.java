package org.example;

import javax.swing.*;

public class Window extends JFrame {




    public Window() {
        this.setVisible(true);
        this.setSize(1000, 650);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Marvel");

        OpenningScreen openningScreen = new OpenningScreen();
        this.add(openningScreen);
        openningScreen.setVisible(true);






        openningScreen.getButton().addActionListener(e->{
            openningScreen.setVisible(false);
            OptionsScreen optionsScreen = new OptionsScreen();
            this.setContentPane(optionsScreen);
//            this.revalidate();
//            this.repaint();
            //optionsScreen.setVisible(true);
        });





    }

    public void showWindow(){
        this.setVisible(true);
    }
}