
/*
 3.Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		LojaMolde p1 = new 	LojaMolde ("Leite", 50);
		LojaMolde p2 = new	LojaMolde ("P�o", 50);
		LojaMolde p3 = new 	LojaMolde ("Bolo", 25);
		LojaMolde p4 = new 	LojaMolde ("Sal", 10);
		int d = 0;
		ArrayList<LojaMolde> lista = new ArrayList<>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		System.out.println(lista);
		System.out.println("A lista tem " + lista.size() + " itens.");
		try
		{
		System.out.println("Voc� deseja remover algum?\n"
							+ "1-Sim | 2-N�o");
		d=ler.nextInt();
	
			if (d==1)
			{
				System.out.println(lista);
			
				System.out.println("Qual item? ( 0 sendo o primeiro item e 3 o ultimo item): ");
				lista.remove(ler.nextInt());
			
				System.out.println(lista);
			}	
		
			else 
			{
				System.out.println("Fim do programa");
			}
		
		} catch (Exception erro)
		{
			System.out.println("Voc� cometeu um erro.");
		} 
		
	}

}
