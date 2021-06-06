package com.fredoca.entites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bricks{
	
	private int width, height;
	private int numFileiras = 15;
	private int numColunas = 23;
	private int spacex = 5;
	private int spacey = 5;
	private Rectangle[][] currentBrick = new Rectangle[numFileiras][numColunas];
	public Bricks(int width, int height) {
		this.width = width;
		this.height = height;
		
		
	}
	public void tick() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				currentBrick[i][j] = new Rectangle (i, j, width, height);
			}
		}
		
	}
	public void render(Graphics g) {
		for(int i = 0; i < numColunas; i++) {
			for(int j = 0; j < numFileiras; j++) {
				g.fillRect(i*width, j*height, width-spacex, height-spacey);
			}
		}
	}
	public boolean isGameOver() {
		//metodo que checa se todas ascaixas foram destruídas
		return false;
	}
}
