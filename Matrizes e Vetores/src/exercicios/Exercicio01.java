package exercicios;

public class Exercicio01 {
			 
		public static void main(String[] args) {
	
			int A[] = new int[6];
			int simples;
			
			//a)
			A[0]= 1;
			A[1]= 0;
			A[2]= 5;
			A[3]= -2;
			A[4]= -5;
			A[5]= 7;
			
			//b)
			simples = A[0] + A[1] + A[5];
			System.out.println("Soma vetores: " + simples);
			
			//c)
			A[4] = 100;
			System.out.println("\nAlteração do valor posição: " + A[4]);
			
			//d)
			System.out.print("\nValores do vetor: ");
			for (int i = 0; i < A.length; i++) {
				System.out.println(A[i]);
			}
		}

	}


