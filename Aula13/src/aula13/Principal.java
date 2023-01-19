package aula13;

public class Principal {

	public static void main(String[] args) {
	
		Mamifero m = new Mamifero();
		m.emitirSom();
		
		Lobo l = new Lobo();
		l.emitirSom();
		
		Cachorro c = new Cachorro();
		c.emitirSom();
		c.setPeso(4.5f);
		c.setIdade(1);
		c.reagir();

	}

}
