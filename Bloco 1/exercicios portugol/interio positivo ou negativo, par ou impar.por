programa
/*
Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numero

		escreva ("Digite um numero inteiro: ")
		leia (numero)

		numero= numero%2

		se (numero ==0) 
		{
			escreva ("Esse numero é par")
		}

		senao
		{
			escreva ("esse numero é impar")
		}
		
		
		
		se (numero < 0)
		 {
		 	escreva (" e negativo.")
		 }
		 senao
		 {
		 	escreva (" e positivo.")
		 }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */