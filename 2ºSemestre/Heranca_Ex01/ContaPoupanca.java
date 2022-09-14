package Heranca_Ex01;

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
}
