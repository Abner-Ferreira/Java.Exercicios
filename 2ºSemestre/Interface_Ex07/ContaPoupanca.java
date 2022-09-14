package Interface_Ex07;


public class ContaPoupanca extends Conta implements ContaBasica{
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

	@Override
	public void Depositar(double valor) {
		super.Depositar(valor);
		
	}

	@Override
	public void Sacar(float valor) {
		super.Sacar(valor);
		
	}
}
