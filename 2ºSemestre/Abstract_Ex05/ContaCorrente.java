package Abstract_Ex05;

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
	
	public void Depositar(double valor, String nomeDepositante) {
	       super.Depositar(valor);
	}
	   
	public void Sacar(double valor) {
	   	super.Sacar(valor);
	}
}

