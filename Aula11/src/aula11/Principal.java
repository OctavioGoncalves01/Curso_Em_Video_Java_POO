package aula11;

public class Principal {

	public static void main(String[] args) {
		Bolsista b1 = new Bolsista();
		b1.setNome("Octavio");
		b1.setBolsa(123);
		b1.setMatricula(321);
		b1.setCurso("ADS");
		b1.setIdade(20);
		b1.setSexo("M");
		
		b1.pagarMensalidade();
		b1.fazerAniversario();
		b1.StatusPessoa();
		
	}

}
