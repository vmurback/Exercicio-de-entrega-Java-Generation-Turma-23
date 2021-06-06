package ExercicioPoo06;

public class ContaBancaria {
	
	private String titular;
	private String cpf;
	private String conta;
	private String agencia;
	
	
	public ContaBancaria(String titular, String cpf, String conta, String agencia) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.conta = conta;
		this.agencia = agencia;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void conta() {
		System.out.println("Titular: " + getTitular());
		System.out.println("Modelo: " + getCpf());
		System.out.println("Marca: " + getConta());
		System.out.println("Preco: " + getAgencia());
		System.out.println();

	
	}
	

}
