package entendentoinstanceofemaisconceitosimportantes;

public class Player {

	public int vida = 100;
	public Player() {
		
	}
	public void atacarInimigo(Enemy enemy) {
		enemy.vida--;
	}
}
