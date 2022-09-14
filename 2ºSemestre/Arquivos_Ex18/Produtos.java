package Arquivos_Ex18;

public class Produtos {
	private String nome;
	private int qtd_estoque;
	private double preco;
	
	public Produtos () {}
	public Produtos (String nome, int qtd_estoque, double preco) {
		this.nome = nome;
		this.qtd_estoque = qtd_estoque;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
