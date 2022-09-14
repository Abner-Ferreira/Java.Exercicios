package Interface_Ex07;


public class ContaSalario extends Conta implements ContaBasica{
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
	@Override
	public void Depositar(double valor) {
		super.Depositar(valor);
		
	}
	@Override
	public void Sacar(float valor) {
		super.Sacar(valor);
		
	}
	
	
}

