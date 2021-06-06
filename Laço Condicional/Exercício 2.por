programa
{
//Exercício 2
	
	funcao inicio()
	{
		
		real codigo
		real horaHT
		real horaExc
		real horaExt
		real salario
		
		escreva("Digite o número de horas trabalhadas \n")
			leia(horaHT)

		se(horaHT > 50.0 ) {
				horaExc = horaHT - 50 
					horaExt = horaExc * 20
						salario = 50.0*10.0


				escreva("\nSalário: " + salario)
					escreva("\n Salário Excedente: " + horaExt)
						escreva("\nSalário Total: ", salario + horaExt)
			}

			
		senao  { 

			horaExt = 0.0
				salario = horaHT*10.0	

				escreva("\nSalário Total:" + salario)
					escreva("\nSalário Excedente: " + horaExt )

			
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */