package exercicios;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn = new Random();
		int mat[][] = new int[3][3];
		int cont = 0;

		for (int l = 0; l < mat.length; l++) {
			System.out.println();
			for (int c = 0; c < mat[0].length; c++) {
				mat[l][c] = rn.nextInt(26);
				System.out.print(mat[l][c] + " ");
				if (mat[l][c] > 10) {
					cont += 1;
				}
			}
		}

		System.out.println("\nA quantidade de n�meros maiores que 10 � de : " + cont);
	}

}