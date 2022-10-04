package Camadas_Ex25;

import java.sql.SQLException;
import java.util.Scanner;

public class Programa {

	public static void main (String[] args) throws SQLException {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		int opcao;
		
		do {
			
			System.out.println("-------PRODUTOS-------");
   			System.out.println("\n1 - Cadastrar Produtos \n2 - Listar Produtos \n3 - Listar um �nico Produto "
   					+ " \n4 - Atualizar Produtos\n5 - Excluir Produtos\n6 - Sair");
   			System.out.println("Digite a op��o que deseja: ");
   			opcao = sc.nextInt();
   			
   			if (opcao == 1) {
   				Produto p = new Produto();
   				
   				System.out.println("Digite o nome do produto: ");
   				p.setNome(sc.next());
   				
   				System.out.println("Digite o pre�o do produto: ");
   				p.setPreco(sc.nextDouble());
   				
   				System.out.println("Digite a quantidade do produto: ");
   				p.setQuantidade(sc.nextInt());
   				
   				ProdutoService.InserirProduto(p);
   			}
   			else if (opcao == 2) {
   				ProdutoService.ExibirProdutos();
   			}
   			else if (opcao == 3) {
   				System.out.println("Digite o ID do produto que deseja mostrar: ");
   				ProdutoService.ExibirProduto(sc.nextInt());
   			}
   			else if (opcao == 4) {
   				int id; 
   				System.out.println("Digite o ID do produto a ser atualizado: ");
   				id = sc.nextInt();
   				ProdutoService.ExibirProduto(id);
   				
   				Produto produto = new Produto();
   				
   				produto.setId(id);
   				
   				System.out.println("Digite o novo nome do produto: ");
   				produto.setNome(sc.next());
   				
   				System.out.println("Digite o novo pre�o do produto: ");
   				produto.setPreco(sc.nextDouble());
   				
   				System.out.println("Digite a nova quantidade do produto: ");
   				produto.setQuantidade(sc.nextInt());
   				
   				ProdutoService.AtualizarProduto(produto);
   				
   			}
   			
   			else if(opcao == 5) {
   				int id;
   				String conf;
   				
   				System.out.println("Digite o ID do produto a ser excluido: ");
   				id = sc.nextInt();    	   				
   				ProdutoService.ExibirProduto(id);
   				
   				System.out.println("Tem certeza que deseja excluir esse produto? ");
   				conf = sc.next().toUpperCase();
   				
   				if (conf.equals("S")) {
   					ProdutoService.ExcluirProduto(id);
   				}
   			}
			
		} while (opcao != 6);
	}
	
	
	
}
