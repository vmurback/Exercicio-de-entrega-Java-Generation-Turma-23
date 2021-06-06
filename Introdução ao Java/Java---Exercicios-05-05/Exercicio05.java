
package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, mp;
		


			System.out.println("\nInforme a primeira nota: ");
				n1 = ler.nextDouble();
				
			System.out.println("\nInforme a segunda nota: ");
				n2 = ler.nextDouble();
				
			System.out.println("\nInforme a terceira nota: ");
				n3 = ler.nextDouble();
				
			mp = ((n1*2) + (n2*3) + (n3*5)) / 10;	
					
			System.out.println("\nA média do aluno é: " + mp);
			
				

			
		    

	}

}