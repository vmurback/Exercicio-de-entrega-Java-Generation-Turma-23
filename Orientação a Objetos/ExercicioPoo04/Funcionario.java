package ExercicioPoo04;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String cpf;
	private String setor;
	
	public Funcionario(String nome, String sobrenome, int idade, String cpf, String setor) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void funcionarios() {
		System.out.println("nome: " + getNome());
		System.out.println("modelo: " + getSobrenome());
		System.out.println("tipo: " + getIdade());
		System.out.println("fabricante: " + getCpf());
		System.out.println("preco: " + getSetor());
		System.out.println();

	}
	

}
