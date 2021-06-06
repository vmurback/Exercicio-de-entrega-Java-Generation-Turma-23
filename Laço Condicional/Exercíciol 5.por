programa
{
	
	funcao inicio()
	{

	real p
	real a = 0.3
	real b = 0.4
	real c = 0.5



		escreva("Informe o nível de poluição coletado: ")
			leia(p)

		se(p <= a){
			escreva("\n A secretaria de Meio Ambiente informa que de acordo com o nível informado de poluição todas atividades podem ser exercidas, pois o controle está dentro do aceitável! ")
			
			} 
		
		senao se(p >= a e p <= b){
			escreva("\nDevido ao alto indice de poluição medido e informado solicitamos a suspensão temporária das atividades que competem as indústrias do primeiro grupo!")
			
			} 

		senao se(p >= b e p <= c){
			escreva("\nDevido ao alto indice de poluição medido e informado solicitamos a suspensão temporária das atividades que competem as indústrias do primeiro e segundo grupo!")
			}	

		senao se(p >= c){
			escreva("\nDevido ao alto indice de poluição medido e informado solicitamos a suspensão temporária de todas as atividades que competem a todas as idustrias dentro do programa!")
			}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */