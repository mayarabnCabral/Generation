/*
 Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 */
package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int n, soma=0;
		
		System.out.print("Digite um numero : ");
		n= ler.nextInt();
		
		do
		{
			System.out.print("Digite um numero : ");
			n= ler.nextInt();
			soma += n;
			
			
			

		}while(n!=0);
		
		System.out.println("A soma de todos o numeros � "+soma);
		
	}

}
