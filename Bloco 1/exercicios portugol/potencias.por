programa
{
	inclua biblioteca Matematica -->mat

	
	funcao inicio()
	{
		real n1, n2, n3, n4,p1, p2, p3, p4
		
		escreva ("Digite um numero: ")
		leia (n1) 

		escreva ("Digite mais um numero: ")
		leia (n2) 

		escreva ("Digite mais um numero: ")
		leia (n3)

		escreva ("Digite mais um numero: ")
		leia (n4)

		p1= mat.potencia(n1, 2)
		p2= mat.potencia(n2, 2)
		p3= mat.potencia(n3, 2)
		p4= mat.potencia(n4, 2)

		se (p3==1000)
		{
		escreva ("A potencia do terceiro numero digitado é ",p3,".")
		}
		senao
		{
		escreva ("A potencia do primeiro numero é ",p1,".")
		escreva ("\nA potencia do segundo numero é ",p2,".")
		escreva ("\nA potencia do terceiro numero é ",p3,".")
		escreva ("\nA potencia do quarto numero é ",p4,".")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */