programa
{
	
	funcao inicio()
	{

		inteiro soma = 0, media = 0, totalV, valorA= 0, valorB = 0
		
		

		enquanto(valorA>=0) 
		{

			
			soma = soma + valorA
			valorB = valorB+1
			media = soma /valorB

			escreva(" Informe  um valor: ")
			leia(valorA)

			
		}	

		escreva("\nA soma dos números informados é de: " + soma, "\nA média dos números informados é de: " + media, "\nA quantidade de imputs foi de: " + valorB)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */