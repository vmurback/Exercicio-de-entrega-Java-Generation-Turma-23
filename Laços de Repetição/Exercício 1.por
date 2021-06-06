programa
{
	
	funcao inicio()
	{

	real sal, somaSal = 0.0, maiorSal= 0.0, mediaSal = 0.0,  somaF = 0.0, mediaF, porcent100 = 0.0, cont100 = 0.0
	inteiro numf, hab = 20, cont

	para(cont=1; cont<=hab; cont++) { //--> contador

		escreva(" Informe o salário do cidadão: ")
			leia(sal)

		escreva("\n Qual a quantidade de filhos do cidadão?")
			leia(numf)

		
		somaSal = somaSal + sal
		somaF = somaF + numf

	
	se (maiorSal < sal)
			{
				maiorSal = sal 
			}

	se (sal <= 100)
			{
				cont100++
			}

	}
	
		mediaSal = somaSal / hab
		mediaF = somaF / 20
		porcent100 = (cont100*100) / 20

		
		escreva("\n Média Salarial: ",mediaSal)
		escreva("\n Média número de filhos: ",mediaF)
		escreva("\n Maior salário: ",maiorSal)
		escreva("\n Porcentagem de pessoas que recebem até 100 reais: ",porcent100)

		
			

	

	

	
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */