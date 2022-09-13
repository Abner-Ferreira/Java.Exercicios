package Ex38;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome= nome ;
	}
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setCategoria (Categoria categoria) {
		this.categoria = categoria;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	public String getExbirCategoria() {
		if (this.categoria != null) {
			return ("O id da categoria é: "+ this.categoria.getIdC()+ " O nome da categoria é: " + this.categoria.getNomeC());
		}else {
			return("Esse produto não possui categoria");
		}
	}
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, double preco, double quantidade, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public String getExibirNomePreco () {
		return ("Nome do Produto: " + this.nome + " Preço: " + this.preco);
	}
	
	public String getExibirNomeQuantidade() {
		return ("Nome: " + this.nome + " Quantidade: " + this.quantidade);
	}
}
