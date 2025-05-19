programa
/*
 Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
{
	
	funcao inicio()
	{
		inteiro vet[10], contador=0, soma=0, x, n

		para (x=0; x<10; x++)
		{
			escreva (" \nDigite o valor obtido com o lançamento dos dados: ")
		 	leia (vet[x])

		 	se (vet[x] <=6)
		 	{
		 		soma =soma + vet[x]
		 		
		 	}	
		 	se (vet[x] ==6)
		 	{
		 		contador++
		 		
		 	}
		 	se (vet[x] >= 7)
		 	{
		 		escreva ("\nEsse numero não é valido")
		 	}
		}
	escreva ("\nA média aritmética dos lançamentos é: ",soma/10)
	escreva ("\nO maior numero possivel (6) apareceu ",contador," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 12, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */