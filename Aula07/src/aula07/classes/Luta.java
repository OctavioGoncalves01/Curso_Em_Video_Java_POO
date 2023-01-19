package aula07.classes;

import java.util.Random;

public class Luta {

	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//metodos publicos
	public void marcarLuta(Lutador lutador01, Lutador lutador02) {
		if (lutador01.getCategoria().equals(lutador02.getCategoria()) && 
			(lutador01 != lutador02) ) {
				this.setDesafiado(lutador01);
				this.setDesafiante(lutador02);
				this.setAprovada(true);
		}
		else{
			this.setDesafiado(null);
			this.setDesafiante(null);
			this.setAprovada(false);
		}
	}
	public void lutar() {
		if (this.isAprovada()) {
			
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch (vencedor) {
				case 0:
					System.out.println("Empate");
					this.desafiado.empate();
					this.desafiante.empate();
					break;
					
				case 1:
					System.out.println("Vencedor " + this.desafiado.getNome());
					this.desafiado.ganhar();
					this.desafiante.derrota();
					break;
					
				case 2:
					System.out.println("Vencedor " + this.desafiante.getNome());
					this.desafiado.derrota();
					this.desafiante.ganhar();
					break;
			}
			
			
		}else {
			System.out.println("A luta não pode acontecer");
		}
	}
}
