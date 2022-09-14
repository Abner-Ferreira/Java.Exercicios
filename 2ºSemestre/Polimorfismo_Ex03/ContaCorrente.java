package Polimorfismo_Ex03;

public class ContaCorrente extends Conta{
	private double chequeEspecial;

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public ContaCorrente() {
		
	};
	public ContaCorrente(int id, String agencia, String numero, double saldo, double chequeEspecial) {
		super(id, agencia, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	};
	
	public void Depositar (double valor) {
		
		super.Depositar(valor);
		
		valor -= 0.10;
		
		this.setSaldo(valor);
	}
}
