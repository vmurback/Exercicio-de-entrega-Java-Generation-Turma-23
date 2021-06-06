package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			         
	        //EXERC�CIO 03
			// Exercicio tempo do arquivo

	        Scanner leia = new Scanner(System.in);
	        
	        int segundos, horas, minutos;
	        
	        System.out.print("Quantos segundos durou o evento ? ");
	        segundos = leia.nextInt();
	        
	        horas = segundos/3600;
	        minutos = ((segundos%3600)/60);
	        segundos =((segundos%3600)%60);
	        
	        System.out.println("A dura��o do evento foi de: " + horas + " horas");
	        System.out.println("A dura��o do evento foi de: " + minutos + " minutos");
	        System.out.println("A dura��o do evento foi de: " + segundos + " segundos");

	    

	}

}
