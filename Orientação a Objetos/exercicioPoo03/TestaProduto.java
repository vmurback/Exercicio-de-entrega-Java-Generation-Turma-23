package exercicioPoo03;

public class TestaProduto {
	
	public static void main(String[] args) {
	
	
	Produto produto1 = new Produto("Samsung Galaxy","S10", "Smartphone", "Samsung", 2000.00);
	Produto produto2 = new Produto("EchoDot"," 4ª geração","Assistente de Voz","Amazon", 600.00);
	Produto produto3 = new Produto("Acer 25 LED","Predator", "Monitor","Acer", 2500.00);
	
System.out.println("Temos os seguintes produtos em estoque: \n");
	
	produto1.eletronicos();
	produto2.eletronicos();
	produto3.eletronicos();
	

	}
}
