package RPG_50taoo;

import java.util.Random;

public class Personagem implements AcoesPersonagem {
	
	private String nome;
	private int classe, arquetipo, vida, ataque, dano, armadura;
	private boolean acerto;
	
	Random dado = new Random();
	
	public void atacar()  {
		if (this.classe == 1 && this.arquetipo == 1) {
				System.out.println("Voc� ataca o imperador com um feiti�o de fogo!\n");
				ataque = (dado.nextInt(20) + 1) + (dado.nextInt(10) + 3);
				
				if (ataque >= 14) {
					acerto = true;
				}
				else {
					acerto = false;
					
					System.out.println("Mas voc� errou! E algu�m t� pegando fogo(bixo) sem ser o Imperador...\n");
				}
				
				if (acerto == true) { 
					dano = dado.nextInt(10) + 5;
				}
		}
		
		else if (this.classe == 1 && this.arquetipo == 2) {
				System.out.println("Voc� ataca o imperador com um feiti�o de gelo!\n");
				ataque = (dado.nextInt(20) + 1) + (dado.nextInt(8) + 7);
				
				if (ataque >= 14) {
					acerto = true;
				}
				else {
					acerto = false;
					System.out.println("Mas voc� errou! Parab�ns, tu iniciou um filme da Disney...e o Imperador " 
					+ "livre est�aaaa, livre est�aaaaaa...\n");
				}
				
				if (acerto == true) { 
					dano = dado.nextInt(8) + 7;
				}
		}
		
		else if (this.classe == 2 && this.arquetipo == 1) {
			System.out.println("Voc� dispara uma flecha em dire��o ao imperador!\n");
			ataque = (dado.nextInt(20) + 8);
			
			if (ataque >= 14) {
				acerto = true;
			}
			else {
				acerto = false;
				System.out.println("Mas voc� errou! Parab�ns, agora tem uma flecha fincada em algu�m...e n�o � "
				+ "o Imperador.\n");
			}
			
			if (acerto == true) { 
				dano = dado.nextInt(8) + 6;
			}
		}
		
		else {
			System.out.println("Voc� ataca o imperador com sua katana!\n");
			ataque = (dado.nextInt(20) + 4);
			
			if (ataque >= 14) {
				acerto = true;
			}
			else {
				acerto = false;
				System.out.println("Mas voc� errou! E agora algu�m virou sashimi...e n�o � o Imperador!\n");
			}
			
			if (acerto == true) { 
				dano = dado.nextInt(10) + 7;
			}
		}
	}
	
	public void informacoesPersonagem() {
		System.out.println("Nome do personagem: " + this.nome);
		System.out.println("Vida do personagem: " + this.vida);
		System.out.println("Armadura do personagem: " + this.armadura);
	}
	
	public void checarClasse(int classe) {
		if (this.classe == 1 && this.arquetipo == 1) {
			System.out.println("Classe do personagem: Mago");
			System.out.println("Arquetipo do personagem: Piromancia");
		}	
		else if (this.classe == 1 && this.arquetipo == 2) {
			System.out.println("Classe do personagem: Mago");
			System.out.println("Arquetipo do personagem: Criogenia");
		}	
		else if (this.classe == 2 && this.arquetipo == 1) {
		System.out.println("Classe do personagem: Guerreiro");
		System.out.println("Arquetipo do personagem: Arqueiro");
		}
		else {
			System.out.println("Classe do personagem: Guerreiro");
			System.out.println("Arquetipo do personagem: Samurai");
		}
	}
	
	public void checarClasse(int classe, int arquetipo) {
		if (this.classe == 1 && this.arquetipo == 1) {
			System.out.println("Classe do personagem: Mago focado em Piromancia");
		}	
		else if (this.classe == 1 && this.arquetipo == 2) {
			System.out.println("Classe do personagem: Mago focado em Criogenia");
		}	
		else if (this.classe == 2 && this.arquetipo == 1) {
		System.out.println("Classe do personagem: Guerreiro que empunha arco e flecha");
		}
		else {
			System.out.println("Classe do personagem: Guerreiro que empunha katana");
		}
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	}

	public int getArquetipo() {
		return arquetipo;
	}

	public void setArquetipo(int arquetipo) {
		this.arquetipo = arquetipo;
	}

	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDano() {
		return dano;
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	@Override
	public void checarClasse() {
		// TODO Auto-generated method stub
		
	}

}