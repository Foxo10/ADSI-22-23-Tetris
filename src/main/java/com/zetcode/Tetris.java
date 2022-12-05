package com.zetcode;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Vista.Sonido;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
Java Tetris game clone

Author: Jan Bodnar
Website: https://zetcode.com
 */
public class Tetris extends JFrame {
	
	private static final Logger logger = LogManager.getLogger(Tetris.class);

    private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //getContentPane().setBackground(Color.GREEN);
    }

    JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {

    	logger.info("Playing");
        Sonido.getMiSonido().ReproducirSonido("Resources/Escudo.wav");
        EventQueue.invokeLater(() -> {

            var game = new Tetris();
            game.setVisible(true);

        });
    }
}