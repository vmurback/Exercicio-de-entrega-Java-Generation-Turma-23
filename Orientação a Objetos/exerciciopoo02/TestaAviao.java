package exerciciopoo02;

public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando um objeto

		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();

		aviao1.marca = "Airbus";
		aviao1.modelo = "Airbus A320";
		aviao1.detentor = "Azul";
		aviao1.capacidade = "220 passageiros";
		aviao1.velocidadeMáxima = "1074.28 km/h";
		aviao1.alturaMáxima = "11,887 metros";
		aviao1.combustível = "23000 litros";

		aviao2.marca = "Boeing";
		aviao2.modelo = "Boeing 737";
		aviao2.detentor = "Avianca";
		aviao2.capacidade = "215 passageiros";
		aviao2.velocidadeMáxima = "840 km/h";
		aviao2.alturaMáxima = "12,4968 metros";
		aviao2.combustível = "25.816 litros";

	
		System.out.println("===============================================");

		System.out.println("||   Ficha Técnica 			     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Aguardando liberação  		     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||	Avião 1" + "			 	     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Marca: " + aviao1.marca + "			     ||");
		System.out.println("||  Modelo: " + aviao1.modelo + "			     ||");
		System.out.println("||  Detentor: " + aviao1.detentor + "			     ||");
		System.out.println("||  Capacidade: " + aviao1.capacidade + "	             ||");
		System.out.println("||  Velocidade Máxima: " + aviao1.velocidadeMáxima + "          ||");
		System.out.println("||  Altura Máxima: " + aviao1.alturaMáxima + "             ||");
		System.out.println("||  Combustível" + aviao1.combustível + "		     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||	Avião 2 " + "			     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Marca: " + aviao2.marca + "		             ||");
		System.out.println("||  Modelo: " + aviao2.modelo + "			     ||");
		System.out.println("||  Detentor: " + aviao2.detentor + "		             ||");
		System.out.println("||  Capacidade: " + aviao2.capacidade + "              ||");
		System.out.println("||  Velocidade Máxima: " + aviao2.velocidadeMáxima + " 	     ||");
		System.out.println("||  Altura Máxima: " + aviao2.alturaMáxima + "            ||");
		System.out.println("||  Combustível" + aviao2.combustível + "                 ||");
		System.out.println("===============================================");
	}

}
