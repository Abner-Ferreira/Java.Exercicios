package Model;

public class ContasBancarias {

	private String agencia, numero;
	private double saldo;

	public ContasBancarias() {

	}

	public ContasBancarias(String agencia, String numero, double saldo) {
		this.agencia= agencia;
		this.numero=numero;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

