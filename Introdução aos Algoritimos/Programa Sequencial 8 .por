programa
{
	
	funcao inicio()
	{

 real vBase, custo1,  custo2, vFinal, vFinal2

 	// Custo de fabricação do produto

		escreva("\n Favor inserir o valor de custo do automóvel: ")
		leia(vBase)

	// Taxas adicionadas
	
		custo1 = 0.28
 		custo2 = 0.45
 		vFinal = vBase*custo1 + 100
 		vFinal2 = (vFinal*custo2) + vFinal

 	// Cálculo final

 	escreva("\n O valor final do produto é de: " + vFinal2)

 	

 		
			





		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */