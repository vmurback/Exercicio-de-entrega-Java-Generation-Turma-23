package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	        
	        //EXERC�CIO 02       
	        
	        Scanner leia = new Scanner(System.in);
	        
	        int ano, meses, dias, total;
	        
	        System.out.print("Digite a quantidade de dias: ");
	        total = leia.nextInt();
	        
	        ano = total/365;
	        total = total%365;
	        meses = total/30;
	        total = total%30;
	        dias = total;
	        
	        System.out.println("-----------------------------------------");
	        System.out.println("A sua idade �: " + ano + " anos");
	        System.out.println("A quantidade de meses �: " + meses + " meses");
	        System.out.println("A quantidade de dias �: " + dias + " dias");
	        System.out.println("-----------------------------------------");
	        
	 

	}

}
