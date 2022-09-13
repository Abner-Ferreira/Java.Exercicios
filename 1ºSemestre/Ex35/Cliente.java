package Ex35;



public class Cliente {
	
	private int id; 
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta ;
	
	public Cliente() {
		
	}
	
	public Cliente(int id , String nome , int idade , String email , ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
		
	}
	
	public void setAtualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	public String getAtualizarEmail () {
		return this.email;
	}

	
	public String getExibirNomeIdade() {
		return (this.nome + " - Idade: " +this.idade + "anos" );
	}
	
	public String getExibirDadosConta() {
		if(this.conta != null) {
			return ("Agência: "+this.conta.getAgencia() + " Número: " + this.conta.getNumero() + " Saldo: " + this.conta.getSaldo());
		}else {
			
			return ("Não possui conta");
		}
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade () {
		return this.idade;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	public String getEmail () {
		return this.email;
	}
	
	public void setContaBancaria (ContaBancaria conta) {
		this.conta = conta;
	}
	public ContaBancaria getContaBancaria() {
		return this.conta;
	}
}
