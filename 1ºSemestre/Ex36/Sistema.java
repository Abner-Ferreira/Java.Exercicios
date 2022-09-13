package Ex36;
import java.util.Scanner;
public class Sistema{

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	

	Produto[]ListaProduto= new Produto[5];
	
	int id;
	String nome;
	double preco;
	double quantidade;
	Categoria categoria;
	String possuiCategoria;
	int idC;
	String nomeC;
	
	for (int i = 0 ; i<5 ; i++) {
		Produto p = new Produto();
		
		System.out.println("Digite o id do produto: ");
		id = ler.nextInt();
		p.setId(id);
		
		System.out.println("Digite o nome do produto: ");
		nome = ler.next();
		p.setNome(nome);
		
		System.out.println("Digite o preço do produto: ");
		preco = ler.nextDouble();
		p.setPreco(preco);
		
		System.out.println("Digite a quantidade de produto:");
		quantidade= ler.nextDouble();
		p.setQuantidade(quantidade);
		
		System.out.println("Possui Categoria (S/N) ?: ");
		possuiCategoria = ler.next().toUpperCase();
		
		if(possuiCategoria.equals("S")) {
			Categoria ct= new Categoria();
			
			System.out.printf("Digite o id da categoria: ");
			idC = ler.nextInt();
			ct.setIdC(idC);
			System.out.printf("Digite o nome da categoria: ");
			nomeC = ler.next();
			ct.setNomeC(nomeC);
			
			
			p.setCategoria(ct);
		}else {	
			categoria = null;	
		}
		

		ListaProduto[i] = p;
		}
	
	for (int i = 0 ; i < 5; i++) {
		System.out.printf("\n %s", ListaProduto[i].getExibirNomePreco());
		System.out.printf("\n %s", ListaProduto[i].getexibirNomeQuantidade());
		System.out.printf("\n %s", ListaProduto[i].getExibirCategoria());

	}
	ler.close();
}
}

