package ContaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		
		c1.setNunConta(123);
		c1.setDono("Octavio Goncalves");
		c1.setTipo("CC");
		c1.setStatus(true);
		c1.status();
		
		c1.sacar(50);
		
		c1.fecharConta();
		c1.status();
		
	}

}
