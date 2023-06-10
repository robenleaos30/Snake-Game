package SnakeGame;

import javax.swing.*;

public class GameFrame extends JFrame
{
    GameFrame()
    {
        this.add(new GamePannel());
        this.setTitle("Welcome to Snake Game!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
