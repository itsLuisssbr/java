package aulainterface;

public class Main extends TesteAbstract implements MinhaInterface{
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
			new Main().carregar();
			
		}
		public void chamarMetodoAbstract() {
			iniciarJogo();
		}
		public void instanceMain2() {
			//função auxiliar
			new Main2().print();;
		}
		@Override
		public void carregar() {
			// TODO Auto-generated method stub
			System.out.print("Carregado");
		}
		
		class Main2{
			public void print() {
				System.out.println("Chamando esse método");
			}
		}

		
}
