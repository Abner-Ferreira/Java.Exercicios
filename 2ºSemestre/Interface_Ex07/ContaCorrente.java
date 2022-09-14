package Interface_Ex07;

public class ContaCorrente extends Conta implements ContaBasica{
	
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
	}

	@Override
	public void Depositar(double valor) {
		super.Depositar(valor);
		
	}

	@Override
	public void Sacar(float valor) {
		super.Sacar(valor);
		
	};
}
