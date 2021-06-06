package exercicioPoo03;

public class Produto {

	private String nome;
	private String modelo;
	private String tipo;
	private String fabricante;
	private Double preco;

	public Produto(String nome, String modelo, String tipo, String fabricante, Double preco) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.tipo = tipo;
		this.fabricante = fabricante;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;

	}

	public void eletronicos() {
		System.out.println("nome: " + getNome());
		System.out.println("modelo: " + getModelo());
		System.out.println("tipo: " + getTipo());
		System.out.println("fabricante: " + getFabricante());
		System.out.println("preco: " + getPreco());
		System.out.println();

	}

}
