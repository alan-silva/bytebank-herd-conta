

public class Conta {
	
	
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular ;
	private static int total = 0; // Atributo compartilhado
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de códigos é "+ Conta.total);
		this.agencia=agencia;
		this.numero=numero;
		
		//System.out.println("Estou criando uma conta" + this.numero);
	}
	
	
	// Métodos para ações referente a conta 
	
	public void deposita(double valor) {
	this.saldo += valor;
	}
 
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque Efetuado !");
			return true;
		}
		else {
			System.out.println("Você não tem saldo disponível");
			return false;
		}
		
		
	}
	
	public boolean transfere(double valor, Conta contaDeDestino) {
		
		if(this.saldo>=valor) {
			this.saldo -=valor;
			contaDeDestino.deposita(valor);
			return true;
		}
			return false;
		
		
	}
	
	public double getSaldo(){
		
		return this.saldo;
		
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero; // Este número da direita é referente ao valor de cima, recebe no argumento setNumero.
	}
	
	public int getAgencia() {
		return this.agencia;
	}
 
	public void setAgencia(int agencia) {
	this.agencia = agencia;
}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		
		return Conta.total;
	}

}
