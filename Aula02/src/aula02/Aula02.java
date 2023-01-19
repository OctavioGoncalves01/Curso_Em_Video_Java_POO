package aula02;

public class Aula02 {
	
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		//c1.ponta = 0.5f;
		//c1.tampada = false; //Referancia a atributo
		c1.tampar();
		c1.rabiscar();
		c1.destampar();
		c1.status();//referancia a metodo
		c1.destampar();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Faber-Castell";
		c2.cor = "Preta";
		c2.destampar();
		c2.rabiscar();
		
		
		
	}

}
