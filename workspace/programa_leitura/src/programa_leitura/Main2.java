package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo, digite o seu nome");
		String nome = in.nextLine();
		System.out.println("Seja muito bem vindo, "+nome);
		System.out.println("Você deseja avançar para qual direção? (w, a, s, d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Você está indo para frente");
			System.out.println("Um inimigo apareceu, o que fazer? (a = atacar, c = correr)");
			comando = in.nextLine();
			if(comando.equals("c")) {
				System.out.println("Você correu, o jogo terminou");
			}
			else {
				if(rand.nextInt(100) < 75) System.out.println("Você Ganhou o Jogo");
				else System.out.println("Você perdeu o jogo");
			}
		}
		else if(comando.equals("s")) {
			
		}
	}
}
