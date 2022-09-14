package Abstract_Ex06;

import Herenca_Ex02.Pessoa;

public class PessoaFisica extends Pessoa{
	private String rg;
	private int idade;
	private String cpf;
	private String dtNasc;
	private String genero;
	private String sobrenome;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public PessoaFisica() {
		
	}
	public PessoaFisica(String rg, int idade, String cpf, String dtNasc, String genero, String sobrenome, String nome,String endereco, String numeroEnd, int id ) {
		super(nome,endereco,numeroEnd,id);
		this.rg=rg;
		this.idade=idade;
		this.cpf=cpf;
		this.dtNasc=dtNasc;
		this.genero=genero;
		this.sobrenome=sobrenome;
	}
}
