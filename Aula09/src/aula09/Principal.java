package aula09;

public class Principal {

	public static void main(String[] args) {
	
		Pessoas[] p = new Pessoas[2];
		Livro[] l = new Livro[3];
		
		
		p[0] = new Pessoas("Octavio", 20, "M");
		p[1] = new Pessoas("Maria", 31, "F");
		
		l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
		l[0] = new Livro("Cosmos", "Carl Segat", 453, p[1]);
		l[0] = new Livro("Java Avancado", "Fernanda da Silva", 672, p[0]);
	}

}
