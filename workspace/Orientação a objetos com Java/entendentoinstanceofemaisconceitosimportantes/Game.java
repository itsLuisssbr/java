package entendentoinstanceofemaisconceitosimportantes;

public class Game {

	private Player player;
	private Enemy enemy;
	public Game() {
		//player = new Player();
		player = new tipo1();
		if(player == null) {
			System.out.println("O Player não foi inicializado");
			player = new Player();
		} if (player instanceof tipo1){
			System.out.println("Tipo 1");
		}
		else if(player instanceof Player) {
			System.out.println("O player foi inicializado com sucesso e é um player");
		}
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
