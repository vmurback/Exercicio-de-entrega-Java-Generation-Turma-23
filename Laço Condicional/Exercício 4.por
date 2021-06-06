programa
{
	
	funcao inicio()
	{
		inteiro a


		escreva("Informe um número desejado: ")
			leia(a)

		se (a%2==0 e a/2>=0){
          	escreva ("O número é par e positivo")
          }
          senao se (a%2==0 e a/2<0){
          	escreva ("O número é par e negativo")
          }

          	senao se (a%2 != 0 e a/2>0){
          	escreva ("O número é impar e positivo")
          }
          
          senao {
          	escreva ("O número é impar e negativo")
		
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */