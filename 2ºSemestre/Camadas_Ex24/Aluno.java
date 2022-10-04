package Camadas_Ex24;

public class Aluno {

	private int id;
	private String nome,curso,ra;
	
	
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public Aluno() {
		
	}
	public Aluno(int id, String nome, String ra, String curso) {
		this.id=id;
		this.nome=nome;
		this.ra=ra;
		this.curso=curso;
	}
}
