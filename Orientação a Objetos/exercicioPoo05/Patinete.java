package exercicioPoo05;

public class Patinete {

	private String nome;
	private String modelo;
	private String marca;
	private Double preco;
	
	public Patinete(String nome, String modelo, String marca, Double preco) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void patinetes() {
		System.out.println("nome: " + getNome());
		System.out.println("modelo: " + getModelo());
		System.out.println("marca: " + getMarca());
		System.out.println("preco: " + getPreco());
		System.out.println();

	
	}
}
