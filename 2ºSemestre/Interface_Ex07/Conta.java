package Interface_Ex07;

public class Conta implements ContaBasica{
	private String agencia;
	private String numero;
	private double saldo;
	private int id;
	
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Conta() {
		
	};
	public Conta(int id, String agencia, String numero, double saldo) {
		this.id = id;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void Depositar(double valor) {
		this.saldo+=valor;
		
	}

	public void Sacar(float valor) {
		this.saldo-=valor;
		
	};
}
