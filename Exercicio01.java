package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //EXERCÍCIO 01 

        int anos, meses, dias, bi, total;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe a sua idade em anos, meses e dias");
        System.out.print("Anos: ");
        anos = leia.nextInt();
        
        System.out.print("Meses: ");
        meses = leia.nextInt();
        
        System.out.print("Dias: ");
        dias = leia.nextInt();
        
        bi = (anos/4);
        total = bi + (anos * 365 ) + (meses * 30) + dias;
        System.out.println("Sua idade em dias é: " + total);
    }
}