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
		aviao1.velocidadeM�xima = "1074.28 km/h";
		aviao1.alturaM�xima = "11,887 metros";
		aviao1.combust�vel = "23000 litros";

		aviao2.marca = "Boeing";
		aviao2.modelo = "Boeing 737";
		aviao2.detentor = "Avianca";
		aviao2.capacidade = "215 passageiros";
		aviao2.velocidadeM�xima = "840 km/h";
		aviao2.alturaM�xima = "12,4968 metros";
		aviao2.combust�vel = "25.816 litros";

	
		System.out.println("===============================================");

		System.out.println("||   Ficha T�cnica 			     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Aguardando libera��o  		     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||	Avi�o 1" + "			 	     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Marca: " + aviao1.marca + "			     ||");
		System.out.println("||  Modelo: " + aviao1.modelo + "			     ||");
		System.out.println("||  Detentor: " + aviao1.detentor + "			     ||");
		System.out.println("||  Capacidade: " + aviao1.capacidade + "	             ||");
		System.out.println("||  Velocidade M�xima: " + aviao1.velocidadeM�xima + "          ||");
		System.out.println("||  Altura M�xima: " + aviao1.alturaM�xima + "             ||");
		System.out.println("||  Combust�vel" + aviao1.combust�vel + "		     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||	Avi�o 2 " + "			     ||");
		System.out.println("||" + "					     ||");
		System.out.println("||  Marca: " + aviao2.marca + "		             ||");
		System.out.println("||  Modelo: " + aviao2.modelo + "			     ||");
		System.out.println("||  Detentor: " + aviao2.detentor + "		             ||");
		System.out.println("||  Capacidade: " + aviao2.capacidade + "              ||");
		System.out.println("||  Velocidade M�xima: " + aviao2.velocidadeM�xima + " 	     ||");
		System.out.println("||  Altura M�xima: " + aviao2.alturaM�xima + "            ||");
		System.out.println("||  Combust�vel" + aviao2.combust�vel + "                 ||");
		System.out.println("===============================================");
	}

}
