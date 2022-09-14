package Polimorfismo_Ex03;

public class ContaPoupanca extends Conta{
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	public ContaPoupanca() {
		
	};
	public ContaPoupanca(int id, String agencia, String numero, double saldo, double rentabilidade) {
		super(id , agencia, numero, saldo);
		this.rentabilidade = rentabilidade;
	}
	
	public void Depositar (double valor) {
		super.Depositar(valor);
		
		valor += 0.50;
		this.setSaldo(valor);
	}
	
	public void Depositar (double valor, String nomeDepositante) {
		super.Depositar(valor);
		
		valor += 0.50;
		this.setSaldo(valor);
	}
}
