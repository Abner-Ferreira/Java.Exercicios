package Ex39;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	
	
	public void setAgencia (String agencia) {
		this.agencia = agencia;
	}
	public String getAgencia () {
		return agencia;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero () {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public ContaBancaria() {
		
	}
	public ContaBancaria(String agencia , String numero) {
		this.agencia =agencia ; 
		this.numero = numero;
	}
	
	public void Depositar(double valorDeposito) {
		this.saldo = saldo + valorDeposito;
	}
	
	public void Sacar (double valorSaque) {
		this.saldo = saldo - valorSaque;	
	}
	
	public void Transferir (double valorTransf , Cliente destinatario) {
		this.saldo = this.saldo - valorTransf;
		destinatario.getConta().Depositar(valorTransf);
	}
	
	public double ConsultarSaldo(int id) {
		return this.saldo;
	
	}
}
