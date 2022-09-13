package Ex43;

public class Emprestimo {
	private String status;
	private Livros livro;
	
	
	public Livros getLivro() {
		return livro;
	}

	public void setLivro(Livros livro) {
		this.livro = livro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void Emprestar(int rm, int id) {
		
	}
	
	public Emprestimo () {}
	
	public Emprestimo (String status, Livros livro) {
		this.status = status;
		this.livro = livro;
	}
	
	
}
