package herancasavancadasemetodoconstrutor;

public class Player {
	
	public int vida_inicial, tempo;
	public Player(int vida_inicial, int tempo) {
		System.out.println(vida_inicial + tempo);
	}
	protected void nascer() {
		System.out.println("Nasceu");
	}
	public void iniciarJogador() {
		System.out.println("Jogador iniciado");
	}
}
