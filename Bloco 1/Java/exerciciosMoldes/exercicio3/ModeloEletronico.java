/*
 Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */
package exercicio3;

public class ModeloEletronico {
	
	int duracaoBateria;
	String cor;
	String marca;
	int memoria;
	
	public ModeloEletronico(String c, String m, int me)
	{
		this.duracaoBateria=24;
		this.cor=c;
		this.marca=m;
		this.memoria=me;
	}
	
	public void ram()
	{
		if (memoria < 32)
		{
			System.out.println("produto com pouca memoria");
		}
		
		if (memoria > 64)
		{
			System.out.println("produto com memoria boa");
		}	
	}
	
	public void escrever()
	{
		System.out.println("A bateria dura at� "+this.duracaoBateria );
		System.out.println("A cor do aparelho � "+this.cor);
		System.out.println("A maca do produto � "+this.marca);
		System.out.println("A memoria do produto � de "+this.memoria);
	}

}
