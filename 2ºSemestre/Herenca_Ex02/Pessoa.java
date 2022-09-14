package Herenca_Ex02;

public class Pessoa {
	private String nome;
	private String endereco;
	private String numeroEnd;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumeroEnd() {
		return numeroEnd;
	}
	public void setNumeroEnd(String numeroEnd) {
		this.numeroEnd = numeroEnd;
	}
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endereco, String numeroEnd, int id ) {
		this.nome=nome;
		this.endereco=endereco;
		this.numeroEnd=numeroEnd;
		this.id=id;
	}
}
