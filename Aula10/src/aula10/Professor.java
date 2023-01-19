package aula10;

public class Professor  extends Pessoa{

	private String especialidade;
	private float salario;
	
	
	public void aumentarSalario(float aumento) {
		this.setSalario(getSalario() + aumento);
	}


	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void statusProfessor() {
		statusPessoa();
		System.out.println("Professor: "
				+"\nMateria " + this.getEspecialidade()
				+"\nCurso " + this.getSalario());
	}
}
