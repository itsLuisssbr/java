package com.fredoca.main;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import com.fredoca.entites.*;

import javax.swing.JFrame;

public class Main extends Canvas implements Runnable, KeyListener{
	
	private static final long serialVersionUID = 1L;
	public static final int width = 800;
	public static final int height = 600;
	public static final int scale = 1;
	public boolean isRunning;
	public JFrame frame;
	private Thread thread;
	public BufferedImage image;
	public static Player player;
	public static Ball ball;
	//public List<Bricks> bricks;
	public static Bricks bricks;
	
	public Main() {
		this.setPreferredSize(new Dimension(width*scale, height*scale));
		image = new BufferedImage(width*scale, height*scale, BufferedImage.TYPE_INT_RGB);
		player = new Player(0, 0, 120, 20);
		ball = new Ball(100, 100, 120, 20);
		//bricks = new ArrayList<>();
		bricks = new Bricks(40, 15);
		initFrame();
	}
	public void initFrame() {
		frame = new JFrame("Brickout");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}
	public synchronized void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}
	public void tick() {
		//player.tick();
		//bricks.tick();
		//ball.tick();
	}
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		//player.render(g);
		bricks.render(g);
		//ball.render(g);
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, width*scale, height*scale, null); 
		bs.show();
	}

	@Override
	public void run() {
		
		while(isRunning) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		stop();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
	
	

}
