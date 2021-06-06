package criandoclassesemjava;

public class Main {
	
		public static void main(String[] args) {
			Player player = new Player();
			Player player2 = new Player();
			Enemy enemy = new Enemy();
			player.iniciarJogador();
			player2.iniciarJogador();
			new Player().iniciarJogador();
			enemy.iniciarInimigo();
		}
}
