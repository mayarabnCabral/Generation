/*
 Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
package exercicio2;

public class ModeloAvi�o {
	
	int combustivel;
	int acentos;
	int lotacao;

	boolean voa;

	public ModeloAvi�o ( int l)
	{   
		
		this.combustivel=100;
		this.acentos=150;
		this.lotacao=l;
		this.voa=true;
		
		
	}
	
	public void fale()
	{
		if(lotacao==100)
		{
			System.out.println("O avi�o eata cheio ");
		}
		
		else if (lotacao==0)
		{
			System.out.println("O avi�o esta vazio");
		}
		else
		{
			System.out.println("Ainda h� espa�o no avi�o");
		}
	}
	
	public void escreva(){	
		
		{
			
			System.out.println("O avi�o esta com "+this.combustivel+" % de combustivel");
			System.out.println("O numero de acentos total � "+this.acentos);
			System.out.println("A lota��o � de "+this.lotacao+" %");
			System.out.println("voa?"+this.voa);
	
			
		}
		}

}
