package aula11;

public final class Bolsista extends Aluno{

	private int bolsa;

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Bolsa Renovada");
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Pagamento facilitado");
	}
	
	
}
