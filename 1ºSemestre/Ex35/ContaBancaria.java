package Ex35;

public class ContaBancaria {
	
	private String agencia;
	private String numero;
	private double saldo;
	
	public ContaBancaria () {
		
	}
	
	public ContaBancaria (String agencia , String numero , double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void setAgencia (String agencia) {
		this.agencia = agencia;
	}
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero () {
		return this.numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
}
