programa
{

	
// Idade em data através de dias corridos

	inteiro dia, mes, ano, data
	inteiro dia2, mes2, ano2, data2
	
	funcao inicio()
	{
	//Data Inicial
		escreva("Qual dia do seu nascimento?")
			leia(dia)
				escreva("\n Qual mês do seu nascimento?")
					leia(mes)
						escreva("\n Qual ano do seu nascimento?")
							leia(ano)
//Data Final
	escreva("\n Qual o dia da data atual?")
		leia(dia2)
			escreva("\nQual o mês da data atual?")
				leia(mes2)
					escreva("\nQual o ano da data atual")
						leia(ano2)

//Cálculo
 
 data = dia2-dia + (mes2 - mes)*30 + (ano2 - ano)*365

 // Resolução

 escreva("\n Sua idade em dias é de:" + data )
 




	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */