package aula04b;

public class Caneta {

	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta() {
		this.tampar();
		this.cor = "Azul";
	}
	
	public Caneta (String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setPonta(ponta);
		this.cor = cor;
		this.tampar();
	}
	
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo " + this.getMoledo());
		System.out.println("Ponta " + this.getPonta() );
		System.out.println("Cor " + this.cor);
		System.out.println("Tampada " + this.tampada);
	}
	
	
	
	public String getMoledo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
}
