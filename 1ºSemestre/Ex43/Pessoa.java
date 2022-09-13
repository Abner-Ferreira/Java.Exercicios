package Ex43;

public class Pessoa {
	private String nome ;
	private int rm;
	private String tel;
	private Emprestimo emprestimos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Emprestimo getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(Emprestimo emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	public Pessoa() {}
	public Pessoa (String nome , int rm , String tel, Emprestimo emprestimos) {
		this.nome = nome ;
		this.rm = rm;
		this.tel = tel;
		this.emprestimos = emprestimos;
	}
	
}
