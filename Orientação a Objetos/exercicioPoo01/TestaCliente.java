package exercicioPoo01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//-->Instância de objeto
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		
		cliente1.nome = "Karina";
		cliente1.idade = 27;
		cliente1.endereço ="Rua batatapalha, 95";
		cliente1.telefone = 5511472543149l;
		cliente1.plano= "Silver";
		
		
		cliente2.nome = "Paloma";
		cliente2.idade = 61;
		cliente2.endereço ="Rua batatapalha, 95";
		cliente2.telefone = 5511554623781l;
		cliente2.plano= "Gold";
		
		cliente3.nome = "Thiago";
		cliente3.idade = 23;
		cliente3.endereço ="Rua batatapalha, 95";
		cliente3.telefone = 5511704799064l;
		cliente3.plano= "Bronze";
		
				
		System.out.println("Cliente 1\n");
		
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("Idade: " + cliente1.idade);
		System.out.println("Endereço: " + cliente1.endereço);
		System.out.println("Telefone: " + cliente1.telefone);
		System.out.println("Plano: " + cliente1.plano);
		
		System.out.println("\nCliente 2 \n");
		
		System.out.println("Nome: " + cliente2.nome);
		System.out.println("Idade: " + cliente2.idade);
		System.out.println("Endereço: " + cliente2.endereço);
		System.out.println("Telefone: " + cliente2.telefone);
		System.out.println("Plano: " + cliente2.plano);
		
		System.out.println("\nCliente 3 \n");
		
		System.out.println("Nome: " + cliente3.nome);
		System.out.println("Idade: " + cliente3.idade);
		System.out.println("Endereço: " + cliente3.endereço);
		System.out.println("Telefone: " + cliente3.telefone);
		System.out.println("Plano: " + cliente3.plano);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
