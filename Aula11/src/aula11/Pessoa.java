package aula11;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public void StatusPessoa() {
		System.out.println("Pessoa\nNome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
	}
}
