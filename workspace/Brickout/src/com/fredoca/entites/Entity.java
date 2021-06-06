package com.fredoca.entites;

import java.awt.Graphics;

public class Entity {
	protected int x, y, width, height;
	public Entity(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void tick() {
		
	}
	public void render(Graphics g) {
		g.fillRect(x, y, width, height);
	}
}
