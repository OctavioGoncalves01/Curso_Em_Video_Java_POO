package aula10;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Marilena");
		p.setIdade(30);
		p.setSexo("F");
		p.fazerAniversario();
		p.statusPessoa();
		
		Aluno p1 = new Aluno();
		p1.setNome("Octavio");
		p1.setIdade(20);
		p1.setSexo("M");
		//p1.fazerAniversario();
		p1.setCurso("ADS");
		p1.setMateria("JAVA");
		//p1.CanselarMatricula();
		p1.statusAluno();
		
	}
}
