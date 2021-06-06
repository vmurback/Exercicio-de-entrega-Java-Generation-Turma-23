package ExercicioPoo07;

public class Paciente {
	
	private String nome;
	private int idade;
	private int andar;
	private int quarto;
	
	public Paciente(String nome, int idade, int andar, int quarto) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.andar = andar;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public void entradas() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Quarto: " + getAndar());
		System.out.println("Andar: " + getQuarto());
		System.out.println();
	
	
	}
}
