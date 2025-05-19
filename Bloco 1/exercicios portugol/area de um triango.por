programa
/*
 Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real base,altura,area

		escreva ("Digite o valor da base: ")
		leia (base)

		escreva ("digite o valor de altura ")
		leia (altura)
		
		area=(base*altura)/2
		
		se (base <0 ou altura <0)
		{
			escreva ("os valores não são valido")
		}
		senao
		{
			escreva ("A área do triango é ",area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */