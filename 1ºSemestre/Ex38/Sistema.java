package Ex38;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		
		ArrayList<Produto> listaProduto = new ArrayList<>();
		
		int opcao;
		int id;
		double preco;
		double quantidade;
		String nome;
		String possuiCat;
		Categoria categoria;
		int idC;
		String nomeC;
		
		do {
			System.out.println("==> SISTEMA DE CADASTRO DE PRODUTO <==");
			System.out.println("\n Escolha uma das opções: ");
			System.out.printf("  1 - Adicionar Produto \n  2 - Atualizar Produto \n  3 - Excluir Produto \n  4 - Exibir Produtos \n  5 - Sair \n");
			System.out.println("Digite a opção necessária: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Produto produto = new Produto();
				
				id = listaProduto.size() + 1 ;
				produto.setId(id);
				
				System.out.printf("Digite o nome do produto: ");
				nome = ler.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o preço do produto: ");
				preco = ler.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a quantidade de produto: ");
				quantidade = ler.nextDouble();
				produto.setQuantidade(quantidade);
				
				System.out.println("Esse produto possio categoria (S/N) ? ");
				possuiCat = ler.next().toUpperCase();
				
				if(possuiCat.equals("S")) {
					
					Categoria ct = new Categoria();
					
					System.out.println("Digite o id da categoria: ");
					idC = ler.nextInt();
					ct.setIdc(idC);
					
					System.out.println("Digite a categoria do produto: ");
					nomeC = ler.next();
					ct.setNomeC(nomeC);
					
					produto.setCategoria(ct);
				}else {
					categoria = null;
				}
				listaProduto.add(produto);
				
				System.out.println("Produto adicionado com sucesso!");
				
				System.in.read();
			}
			
			else if (opcao == 2) {
				for(Produto p : listaProduto) {
					System.out.printf("ID: %d Nome do Produto: %s Preço: %.2f Quantidade: %.2f \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
				}
				System.out.printf("\n Digite o id do produto que deseja atualizar: ");
				id = ler.nextInt();
				
				System.out.printf("\n Digite o novo nome que o produto reberá: ");
				nome = ler.next();
				System.out.printf("\n Digite o novo preço do produto: ");
				preco = ler.nextDouble();
				System.out.printf("\n Digite a nova quantidade de produtos: ");
				quantidade = ler.nextDouble();
				
				Produto produto = listaProduto.get(id- 1);
				
				produto.setNome(nome);
				produto.setPreco(preco);
				produto.setQuantidade(quantidade);
				
				System.out.println("Produto atualizado com sucesso!");
				System.in.read();
			}
			else if (opcao ==  3) {
				for(Produto p : listaProduto) {
					System.out.printf("ID: %d Nome do Produto: %s Preço: %.2f Quantidade: %.2f \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());					
				}
				System.out.printf("\n Digite o id do produto que deseja excluir: ");
				id = ler.nextInt();
				
				listaProduto.remove(id - 1);
				
				System.in.read();
					
			}
			else if (opcao == 4 ) {
				for (Produto p : listaProduto) {
					System.out.printf("\n ID: %d Nome do Produto: %s Preço: %.2f Quantidade: %.2f \n %s \n", p.getId(), p.getNome(), p.getPreco(), p.getQuantidade(),p.getExbirCategoria());
				}
			}
			
		}while (opcao != 5);
	}

}
