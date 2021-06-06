package arraylist;

import java.util.ArrayList;

public class Game implements Runnable{
	public boolean isRunning;
	private Thread thread;
	private ArrayList <Entity> entity = new ArrayList<>();
	
	public Game() {
		entity.add(new Entity());
		entity.add(new Entity());
		entity.add(new Entity());
		entity.add(new Entity());
		for(int i = 0; i < entity.size(); i++) {
			System.out.println("Hey");
			Entity e = entity.get(i);
		}
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}
	public void tick() {
		//atualizar o jogo
		System.out.println("Tick");
	}
	public void render() {
		//renderizar o jogo
		System.out.println("Render");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
