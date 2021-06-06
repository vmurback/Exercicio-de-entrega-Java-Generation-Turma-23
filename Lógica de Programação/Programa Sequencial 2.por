programa
{

	// Idade em data através de dias corridos

	inteiro totalDias, idadeDias, idadeMeses, idadeAnos
	
	
	funcao inicio()
	{
//Dias corridos
		escreva("Digite a quantidade de dias que você já viveu:")
			leia(totalDias)

//Cálculo
		idadeAnos = totalDias/365

		totalDias = totalDias%365
		
		idadeMeses = totalDias/30

		totalDias = totalDias%30

		idadeDias = totalDias
 


 // Resolução

	escreva("A idade é: " + idadeAnos + "anos")
		escreva("\n A quantidade de meses é :" + idadeMeses + "meses")
			escreva("\n A quantidade de diasé: " + idadeDias + "dias")
 


						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */