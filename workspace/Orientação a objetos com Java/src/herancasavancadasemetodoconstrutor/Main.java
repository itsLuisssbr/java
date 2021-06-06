package herancasavancadasemetodoconstrutor;

public class Main extends Player{
	private String nome = "Fred";
	public static final int VIDA_MAXIMA = 100;
	public Main(int n1, int n2) {
		super(n1, n2);
		System.out.println("Novo método");
	}
	public String getNome() {
		return nome;
	}
	
		public static void main(String[] args) {
			Main main = new Main(100, 200);
			System.out.println(Main.VIDA_MAXIMA);
			
		}
		
}
