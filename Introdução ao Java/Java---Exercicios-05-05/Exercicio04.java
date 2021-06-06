package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    
		        //EXERCICIO 04
		    
		    double a = 0.0,b = 0.0,c = 0.0,d = 0.0,r = 0.0,s = 0.0;
		    
		    Scanner leia = new Scanner(System.in);
		    
		    System.out.print("Informe os próximos três valores para obter o resultado. ");
		    
		    System.out.print("Informe A: ");
		    a = leia.nextDouble(); 
		    
		    System.out.print("Informe B: ");
		    b = leia.nextDouble(); 
		    
		    System.out.print("Informe C: ");
		    c = leia.nextDouble(); 
		    
		     if(a > 0 && b > 0 && c > 0) 
		        {
		        
		            r = (a + b); 
		            r = Math.pow(r, 2);		
		            s = (b + c); 
		            s = Math.pow(s, 2);
		            d = (r + s) / 2;
		            
		            System.out.println("O resultado da equação D = (R + S)/2 é igual a: " + d);
		    
		      }else 
		            {
		                
		                System.out.println("Escreva somente valores positivos");
		            
		            }
		    

	}

}