programa
{
	

	
	funcao inicio()
	{

		


real n1, n2, n3, p1, p2, p3, media

   			escreva("Calcular média pponderada. \n\n")
   			escreva("Insira o valor da primeira nota: ")
			leia(n1)

   			escreva("Insira o peso da primeira nota: ")
   			leia(p1)

  			escreva("Insira o valor da segunda nota: ")
   			leia(n2)

   			escreva("Insira o peso da segunda nota: ")
   			leia(p2)

   			escreva("Insira o valor da terceira nota: ")
   			leia(n3)

   			escreva("Insira o peso da terceira nota: ")
   			leia(p3)

   			media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3)
   			escreva("A média final é: \n", media)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */