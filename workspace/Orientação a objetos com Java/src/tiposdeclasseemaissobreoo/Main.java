package tiposdeclasseemaissobreoo;

public class Main extends TesteAbstract{
		//TODO fredoca
		public static void main(String[] args) {
			Player player = new Player();
			Player player2 = new Player();
			Enemy enemy = new Enemy();
			player.iniciarJogador();
			player2.iniciarJogador();
			new Player().iniciarJogador();
			enemy.iniciarInimigo();
			new Main().instanceMain2();
			new Main().chamarMetodoAbstract();
			
		}
		public void chamarMetodoAbstract() {
			iniciarJogo();
		}
		public void instanceMain2() {
			//função auxiliar
			new Main2().print();;
		}
		
		class Main2{
			public void print() {
				System.out.println("Chamando esse método");
			}
		}
}
