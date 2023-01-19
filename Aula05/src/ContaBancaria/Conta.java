package ContaBancaria;

public class Conta {

	public int nunConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	//Gets e sets
	public void setNunConta(int nunConta) {this.nunConta = nunConta;}
	public int getNunConta() {return this.nunConta;}
	
	public void setTipo(String tipo) {
		if (tipo.toUpperCase().equals("CC")) {
			this.tipo = tipo;
			this.saldo = this.saldo + 50;
		}
		else if (tipo.toUpperCase().equals("CP")) {
			this.tipo = tipo;
			this.saldo = this.saldo + 150;
		}
		else
			System.out.println("Tipo invalido");
	}
	public String getTipo() {return this.tipo;}
	
	public String getDono() {return dono;}
	public void setDono(String dono) {this.dono = dono;}
	
	public float getSaldo() {return saldo;}
	public void setSaldo(float saldo) {this.saldo = saldo;}
	
	public boolean isStatus() {return status;}
	public void setStatus(boolean status) {this.status = status;}
	
	
	
	//metodos
	public void abrirConta() {
		this.status = true;
	}
	
	public void fecharConta() {
		if (this.isStatus() == true) {
			if (this.getSaldo() != 0.0)
				System.out.println("Impossivel fechar conta, verifique a situacao do seu saldo");
			else {
				System.out.println("Conta Fechada");
				this.status = false;
			}		
		}
		else {
			System.out.println("Impossivel usar uma conta fechada!!");
		}		
	}
	
	public void depositar(float deposito) {
		if (this.isStatus() == true) {
			this.saldo = this.saldo + deposito;
			System.out.println("Valor R$"+deposito+" depositado");
		}
		else {
			System.out.println("Impossivel usar uma conta fechada!!");
		}
				
	}
	
	public void sacar(float saque) {
		if (this.isStatus() == true) {
			if (saque > this.getSaldo()) 
				System.out.println("Valor digitado é seuperior ao que existe na conta");
			else {
				this.saldo = this.saldo - saque;
				System.out.println("Valor atual da conta é de R$"+this.getSaldo());
			}	
		}
		else {
			System.out.println("Impossivel usar uma conta fechada!!");
		}
	}
	
	public void pagarMensalidade() {
		if (this.isStatus() == true) {
			if (this.getTipo().equals("CC"))
				this.saldo= this.saldo-12;
			else
				this.saldo= this.saldo-20;
		}
		else {
			System.out.println("Impossivel usar uma conta fechada!!");
		}
		
	}
	
	public void status() {
		System.out.println(getNunConta()+" "+getSaldo()+""+isStatus());
	}
}
