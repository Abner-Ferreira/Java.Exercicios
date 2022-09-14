package Polimorfismo_Ex04;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String dtFund;
	private String nrInscri;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getDtFund() {
		return dtFund;
	}
	public void setDtFund(String dtFund) {
		this.dtFund = dtFund;
	}
	public String getNrInscri() {
		return nrInscri;
	}
	public void setNrInscri(String nrInscri) {
		this.nrInscri = nrInscri;
	}
	
	public PessoaJuridica() {
		
	}
	public PessoaJuridica(String cnpj, String dtFund, String nrInscri,String nome,String endereco, String numeroEnd, int id) {
		super(nome,endereco,numeroEnd,id);
		this.cnpj=cnpj;
		this.dtFund=dtFund;
		this.nrInscri=nrInscri;
	}
}
