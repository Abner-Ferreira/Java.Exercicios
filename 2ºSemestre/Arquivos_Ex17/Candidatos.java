package Arquivos_Ex17;

public class Candidatos {
	private String nome;
	private double notas;
	private String cidades;
	
	public void Candidato () {
		
	}
	public void Candidato (String nome, double notas, String cidades) {
		this.nome = nome;
		this.notas= notas;
		this.cidades=cidades;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	public String getCidades() {
		return cidades;
	}
	public void setCidades(String cidades) {
		this.cidades = cidades;
	}
	
	
}
