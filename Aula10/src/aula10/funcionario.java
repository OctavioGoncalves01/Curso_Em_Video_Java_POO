package aula10;

public class funcionario extends Pessoa{

	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		if (this.isTrabalhando() == false)
			this.setTrabalhando(true);
		else
			this.setTrabalhando(false);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	private void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void statusAluno() {
		statusAluno();
		System.out.println("Funcionario: "
				+"\nSetor " + this.getSetor()
				+"\nTrabalhando " + this.isTrabalhando());
	}
	
}
