package tudosobremetodos;

public class Main {
		
	public static int exemplo() {
		return 10;
	}
	public void exemploOutro() {
		exemplo();
	}
	public void outroMetodo(int n1, String nome) {
		System.out.println(n1 +  nome);
	}
		public static void main(String[] args) {
			Player player = new Player();
			Player2 player2 = new Player2();
			Enemy enemy = new Enemy();
			player.nascer();
			player2.outroMetodo();
			System.out.println(exemplo());
			new Main().outroMetodo(10," fred");
			
		}
		
}
