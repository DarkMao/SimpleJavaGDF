package com.jeff.game.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Game extends JPanel{
	private int gameWidth;
	private int gameHeight;
	private Image gameImage;
	
	private Thread gameThread;
	private volatile boolean running;
	
	public Game(int gameWidth, int gameHeight){
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		setPreferredSize(new Dimension(gameWidth, gameHeight));
		setBackground(Color.BLACK);
		setFocusable(true);
		requestFocus();
	}
}
