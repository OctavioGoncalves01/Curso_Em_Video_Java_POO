package aula10;

public class Aluno extends Pessoa{

	private String materia;
	private String curso;
	private boolean matricula = true;
	
	public void CanselarMatricula() {
		this.setMatricula(false);
	}

	
	//
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isMatricula() {
		return matricula;
	}

	private void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}

	public void statusAluno() {
		statusPessoa();
		System.out.println("Aluno: "
				+"\nMateria " + this.getMateria()
				+"\nCurso " + this.getCurso()
				+"\nStatus Matricula " + this.isMatricula());
	}
}
