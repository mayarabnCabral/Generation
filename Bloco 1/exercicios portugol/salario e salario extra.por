programa
/*
 Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
{
	
	funcao inicio()
	{
		real c, n, hora, salarioTotal, salarioExcedente, salario

		escreva ("quantas horas você trabalhou? ")
		leia (hora)

		salario= hora*10
		salarioExcedente= (hora-50)*20
		salarioTotal= salario + salarioExcedente

		
			
		se (hora>50)
		{
			escreva ("Seu salario excedente é ",salarioExcedente," e seu salário total é ",salarioTotal,".")
			
		}

		senao
		
		escreva ("Seu salario é ",salario)

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */