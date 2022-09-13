package Ex38;

public class Categoria {

	private int idC;
	private String nomeC;
	
	public void setIdc (int idC) {
		this.idC = idC;
	}
	public int getIdC() {
		return this.idC;
	}
	
	public void setNomeC(String nomeC) {
		this.nomeC = nomeC;
	}
	public String getNomeC() {
		return this.nomeC;
	}
	
	public Categoria () {
		
	}
	
	public Categoria(int idC , String nomeC) {
		this.idC = idC;
		this.nomeC = nomeC;
	}
}
