package Polimorfismo_Ex03;

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
	public ContaSalario() {
		
	}
	
	public ContaSalario(int id, String agencia, String numero, double saldo, double salarioBruto, double salarioLiquido) {
		super(id, agencia, numero, saldo);
		this.salarioBruto = salarioBruto;
		this.salarioLiquido = salarioLiquido;
	};
	

}
