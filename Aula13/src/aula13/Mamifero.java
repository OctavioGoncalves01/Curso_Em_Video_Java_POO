package aula13;

public class Mamifero extends Animal{

	protected String corPelo;
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return this.corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println("Som Mamifero");
	}
}
