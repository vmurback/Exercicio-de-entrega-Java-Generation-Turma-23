package exercicioPoo05;

public class TestaPatinete {
	
	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete("Gaevan" , "Turbo5000", "Hasbro", 5000.00);
		Patinete patinete2 = new Patinete("Maybach" , "Spin", "TecToy", 800.00);
		Patinete patinete3 = new Patinete("Rodinho" , "Kids", "Rihappy", 400.00);
		
		
		patinete1.patinetes();
		patinete2.patinetes();
		patinete3.patinetes();

	}
}
