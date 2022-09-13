package Ex43;

public class Livros {
	private String nLivros;
	private int qntd;
	private int id;
	
	public String getnLivros() {
		return nLivros;
	}
	public void setnLivros(String nLivros) {
		this.nLivros = nLivros;
	}
	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Livros() {}
	public Livros(String nLivros, int id, int qntd) {
		this.nLivros = nLivros;
		this.id = id;
		this.qntd = qntd;
	}
}
