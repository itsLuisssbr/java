package exercicioparafixaroo;

public class Game {

	private Player player;
	private Enemy enemy;
	public Game() {
		player = new Player();
		enemy = new Enemy();
	}
	public static void main(String[] args) {
			Game game = new Game();
			Player player = game.getPlayer();
			player.atacarInimigo(game.getEnemy());
			System.out.println(game.getEnemy().vida);
	}
	public Player getPlayer() {
		return player;
	}
	public Enemy getEnemy() {
		return enemy;
	}
}
