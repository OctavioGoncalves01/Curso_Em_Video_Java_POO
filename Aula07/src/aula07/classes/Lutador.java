package aula07.classes;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Construtor 
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitoria);
		this.setDerrotas(derrota);
		this.setEmpates(empate);
		this.setIdade(idade);
		
	}
	
	//Metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(peso);
	}
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria(float peso) {
		if (peso <= 52.2) {
			this.categoria = "Invalido";
		}else if (peso <=70.3) {
			this.categoria = "Leve";
		}else if (peso <=83.9) {
			this.categoria = "Medio";
		}else if (peso <=120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	public void apresentar() {
		System.out.println("Senhoras e Senhores com muito prazer lhes apresento o grande..."
				+ this.getNome()+ "\n tendo " + this.getAltura()+"m, e pesando "+ this.getPeso()+
				"kg, lutando na categoria " + this.getCategoria()+ ",\n Tendo "
						+ this.getVitorias() + " vitorias, " + this.getDerrotas() + 
							" derrotas e " + this.getEmpates() + " empates");
	}
	
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	
	public void ganhar() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void derrota() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empate() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
