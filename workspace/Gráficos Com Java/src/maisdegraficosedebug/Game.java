package maisdegraficosedebug;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	private final int width = 160;
	private final int height = 120;
	private final int scale = 4;
	private Thread thread; 
	private boolean isRunning;
	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	
	
	public Game() {
		this.setPreferredSize(new Dimension(width*scale, height*scale));
		initFrame();
		
	
	}
	void initFrame() {
		frame = new JFrame();
		frame.add(this);
		frame.setResizable (false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public void tick() {
		
	}
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		
		
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, 16, 16);
		g.setColor(Color.red);
		g.fillRect(20, 20, 80, 80);
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 5));
		g.drawString("Olá Mundo", 50, 50);
		g = bs.getDrawGraphics();
		g.drawImage(image,  0,  0,  width*scale, height * scale, null);
		
		bs.show();
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
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double ammountOfTicks = 60.0;
		double ns = 1000000000/ammountOfTicks;
		double delta = 0;
		int frames = 0;
		double time = System.currentTimeMillis();
		while(isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}
			if(System.currentTimeMillis() - time >= 1000) {
				System.out.println("FPS: " + frames);
				frames = 0;
				time += 1000;
			}
			
			
		}
		stop();
		
	}

}
