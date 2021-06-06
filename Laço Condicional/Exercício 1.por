programa
{
//Exercicio 1
	
	funcao inicio()
	{
		real peso = 0.0
		real excesso = 0.0
		real multa = 0.0
		real pesoLimite = 50.0

		escreva("Digite a quantidade de Quilos de tomates que João trouxe: ")
			leia(peso)

			se(peso> pesoLimite)
				excesso = peso - pesoLimite
					multa = excesso*4

					escreva("\nMulta: " + multa + "reais")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */