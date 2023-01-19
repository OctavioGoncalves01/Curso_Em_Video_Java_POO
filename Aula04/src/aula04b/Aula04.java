package aula04b;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.setModelo("Bic");
		//c1.modelo = "bic";
		
		c1.setPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta("Fabar-Castall", "Vermelha", 0.5f);
		c2.status();
	
	
	}

}
