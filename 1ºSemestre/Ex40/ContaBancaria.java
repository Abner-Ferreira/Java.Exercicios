package Ex40;

import java.util.ArrayList;



public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	private double limite;
	private ArrayList<String> extrato;
	
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
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public ArrayList<String> getExtrato() {
		return extrato;
	}
	public void setExtrato(ArrayList<String> extrato) {
		this.extrato = extrato;
	}
	
	public ContaBancaria() {
		
	}
	public ContaBancaria(String agencia, String numero, double saldo, double limite, ArrayList<String> extrato ) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.extrato = extrato;
		this.limite = limite;
	}
	
	public void Depositar (double valorDeposito) {
		saldo += valorDeposito;
		extrato.add("Depósito + $" + valorDeposito);
	}
	
	public void Sacar (double valorSaque) {
		saldo -= valorSaque;
		extrato.add("Saque + $" + valorSaque);
	}
	
	public void Transferir (double valorTransf, Cliente destinatario) {		
//		Sacar(valorTransf);  AQUI O METODO ESTA DENTRO DO OUTRO
//		destinatario.getConta().Depositar(valorTransf);
		saldo -= valorTransf;
		extrato.add("Transferência -$ "+valorTransf);
		destinatario.getConta().saldo += valorTransf;
		destinatario.getConta().getExtrato().add("Transferência +$ "+valorTransf);
		
	}
	
	public double ConsultarSaldo() {
		return saldo;
	}
	
	public String ConsultarExtrato(){
		String texto = " ";
		for(String operacao : extrato) {
			texto = texto + operacao + "\n";
		}
		return texto;
	}
	
}
