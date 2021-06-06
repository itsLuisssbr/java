package programa_leitura;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String nome, idade, peso, cidade, estado, pais;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor digite seu nome: ");
		nome = in.nextLine();
		System.out.println("Por favor digite sua idade: ");
		idade = in.nextLine();
		System.out.println("Por favor digite seu peso: ");
		peso = in.nextLine();
		System.out.println("Por favor digite sua cidade: ");
		cidade = in.nextLine();
		System.out.println("Por favor digite seu estado: ");
		estado = in.nextLine();
		System.out.println("Por favor digite seu país: ");
		pais = in.nextLine();
		
		//gerar resultado final
		System.out.println("Aqui está o resultado do teste: ");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: "+peso);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: "+estado);
		System.out.println("País: " + pais);
		
		
		
	}
}
