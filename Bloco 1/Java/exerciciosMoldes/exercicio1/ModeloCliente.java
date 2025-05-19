/*
 Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina asinstancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package exercicio1;

public class ModeloCliente {
	
		String nome;
		String tamanhoRoupa;
	    String formaDePagamento;
	    boolean gastou;
	    
	public ModeloCliente (String n,String t, String f)
	{
		this.nome=n;
	    this.tamanhoRoupa=t;
	    this.formaDePagamento=f;
	    this.gastou=true;
	
	}
	public void fale()
	{
		if (gastou== true)
		{
			System.out.println("O(a) cliente comprou na loja. ");
			System.out.println(" e o pagamento foi feito no");
		}
		
		else 
		{
			System.out.println("O(a) cliente n�o efetuou uma compra.");
		}
	
	}
	public void escreva()
	{
		System.out.println("\nO(a) cliente se chama "+this.nome);
		System.out.println("Sua roupa � tamanho "+this.tamanhoRoupa);
		System.out.println("Pagou no  "+this.formaDePagamento);
		System.out.println("Gastou? "+this.gastou);
	}


}
