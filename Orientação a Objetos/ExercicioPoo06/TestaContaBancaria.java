package ExercicioPoo06;

public class TestaContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("Helena Murbach", "45863215478", "56987-3", "9635-A");
		ContaBancaria conta2 = new ContaBancaria("Keslon Machado", "75395185200", "14698-5", "8852-0");
		ContaBancaria conta3 = new ContaBancaria("Draven Noxus", "0000056129", "22986-9", "4036-9");
	
		conta1.conta();
		conta2.conta();
		conta3.conta();
		
		

	}
		
}
