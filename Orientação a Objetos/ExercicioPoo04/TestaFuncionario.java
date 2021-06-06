package ExercicioPoo04;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
	Funcionario funcionario1 = new Funcionario("Maria","Jesus", 45, "49635698745","Limpeza");
	Funcionario funcionario2 = new Funcionario("Jose","Carlos", 53, "78969874582","Logística");	
	Funcionario funcionario3 = new Funcionario("Adailton", "Siqueira", 30, "58636412820","RH" );	
	
	funcionario1.funcionarios();
	funcionario2.funcionarios();
	funcionario3.funcionarios();
	
		
	}

}
