package atributosemetodoconstrutor;

public class Main {
	private String nome = "Fred";
	public static final int VIDA_MAXIMA = 100;
	public Main() {
	
		System.out.println("Novo método");
	}
	public String getNome() {
		return nome;
	}
	
		public static void main(String[] args) {
			Main main = new Main();
			System.out.println(Main.VIDA_MAXIMA);
			
		}
		
}
