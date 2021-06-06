programa
{
	//algoritmo “Calcula a duração do tempo em horas, minutos e segundos”
	// 1 hora	em segundos = 60 minutos * 60 segundos.  60*60 = 3600
	funcao inicio() {
		
   	inteiro horas, minutos, segundos, seg
 
    escreva("Digite a duração do evento em segundos:")
    leia(segundos)
    
    horas = (segundos / 3600)
    minutos = ((segundos % 3600) / 60)
    seg = ((segundos % 3600) % 60)
    
    escreva("A duração do evento foi de ", horas," horas ", minutos ," minutos e ", seg ," segundos")
  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */