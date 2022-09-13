package Ex40;



public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private ContaBancaria conta ;
	
	public void setId (int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setNome (String nome) {
		this.nome = nome ;
	}
	public String getNome () {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	public ContaBancaria getConta() {
		return conta;
	}
	
	
	
	public Cliente() {
		
	}
	public Cliente(int id, String nome , int idade , ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.conta =conta ;
		
	}
}
