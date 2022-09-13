package Ex36;



public class Produto {
	private int id;
	private double preco;
	private String nome;
	private double quantidade;
	private Categoria categoria;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getQuantidade() {
		return this.quantidade;
	}
	
	public void setCategoria (Categoria categoria) {
		this.categoria = categoria;
	}
	public Categoria getCategoria() {
		return this.categoria;
	}
	
	public String getExibirNomePreco() {
		return (this.nome + " Preço: " + this.preco);
	}
	
	public String getExibirCategoria() {
		if (this.categoria != null) {
			return (this.categoria.getIdC() + " Categoria: " + this.categoria.getNomeC());
		}
		else {
			return("Esse produto não possui categoria");
		}
	}
	
	public Produto(){
		
	}
	
	public Produto(int id, String nome, double preco, double quantidade, Categoria categoria){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;	
	}
	
	
	public String getexibirNomeQuantidade() {
		return (this.nome + " Quantidade: " + this.quantidade);
	}
}
