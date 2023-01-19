package aula13;

public class Cachorro extends Lobo{

	public void reagir(String frase) {
		if (frase.equals("Bom garoto")) {
			abanarRabo();
			emitirSom();
		}else {
			rosnar();
		}
	}
	
	public void reagir(int hora, int minutos) {
		if (hora > 12) {
			abanarRabo();
		}else if (hora <18) {
			System.out.println("Ignorado com sucesso");
		}else {
			abanarRabo();
			emitirSom();
		}
	}
	
	public void reagir(boolean dono) {
		if (dono == true)
			abanarRabo();
		else {
			rosnar();
			emitirSom();
		}
	}
	
	public void reagir() {
		if(getIdade() <= 5) {
			if (getPeso() < 10)
				abanarRabo();
			else
				emitirSom();
		}else {
			if (getPeso() < 10)
				rosnar();
			else
				System.out.println("Ignorado com sucesso");
		}
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Au au au");		
	}
	
	private void abanarRabo() {
		System.out.println("Abanou o rabo");
	}
	
	private void rosnar() {
		System.out.println("Rosnou");
	}
}
