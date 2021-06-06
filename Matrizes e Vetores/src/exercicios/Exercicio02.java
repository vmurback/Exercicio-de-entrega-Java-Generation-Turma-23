package exercicios;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vet[] = new int[6];
		int somaPar = 0, somaImpar = 0;		
		Random rn = new Random();
		
		
		
		System.out.print("Numeros pares sorteados: ");
		
		for (int i = 0; i < vet.length ; i++) {
			vet[i] = rn.nextInt(26); // atribuição de valores aleatórios			
		
			if(vet[i] % 2 == 0) {
				somaPar += vet[i];				
					System.out.print(vet[i] + " ");		
			}	
		}
		
			System.out.print("| Soma dos números pares: " + somaPar);
				System.out.print("\nNumeros impares sorteados: ");
		
		for (int j = 0; j < vet.length ; j++ ) {
			if (vet[j] % 2 != 0) {
				System.out.print(vet[j] + " ");
					somaImpar += vet[j];
			}
		}
		
		System.out.print("| Soma dos números impares: " + somaImpar);
	}

}