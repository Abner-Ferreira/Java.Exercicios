package Abstract_Ex05;

public class ContaSalario extends Conta{
	private double salarioBruto;
	private double salarioLiquido;
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	public void Depositar(double valor, String nomeDepositante) {
	   super.Depositar(valor);
	}
	   
	public void Sacar(double valor) {
	    super.Sacar(valor);
	}
	
}
