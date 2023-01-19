package aula12;

public class Principal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		
		
	}

}
