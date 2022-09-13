package Ex43;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);

		String nome;
		String nLivro;
		String tel;
		int rm;
		int id ;
		int qntd;
		String status;
		Emprestimo emprestimos;
		Livros livro;
		int opcao;
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		ArrayList<Livros> listaLivros = new ArrayList<>();
		do{
			System.out.println("\n ----------> Biblioteca <----------\n ");
			System.out.println("Escolha um opção: ");
			System.out.printf(" 1 - Cadastrar Pessoa \n 2 - Cadastrar Livro \n 3 - Fazer Empréstimo \n 4 - Devolução de Livros \n 5 - Sair \n");
			System.out.printf("\n Digite a opção desejada: ");
			opcao = ler.nextInt();
		
			if (opcao == 1) {
				Pessoa pessoa = new Pessoa();
				
				rm = listaPessoas.size()+1;
				pessoa.setRm(rm);
				
				System.out.printf("Digite o nome da pessoa: ");
				nome = ler.next();
				pessoa.setNome(nome);
				
				System.out.printf("Digite o telefone de contato: ");
				tel = ler.next();
				pessoa.setTel(tel);
				
				System.out.printf("RM : %d \nNOME: %s \nTELEFONE: %s", rm,nome,tel);
				listaPessoas.add(pessoa);
				System.in.read();
			}else if (opcao == 2) {
				Livros book = new Livros();
				
				id = listaLivros.size()+1;
				book.setId(id);
				
				System.out.printf("Digite o nome do livro: ");
				nLivro = ler.next();
				book.setnLivros(nLivro);
				
				System.out.printf("Digite a quantidade de livros: ");
				qntd = ler.nextInt();
				book.setQntd(qntd);
				
				System.out.printf("ID: %d \nNOME DO LIVRO: %s \nQUANTIDADE: %d", id, nLivro, qntd);
				listaLivros.add(book);
				System.in.read();
			}else if (opcao == 3) {
				System.out.printf("Digite o seu rm: ");
				rm = ler.nextInt();
				
				Pessoa pessoa = listaPessoas.get(rm - 1);
				
				for (Livros book : listaLivros) {
					System.out.printf("ID: %d \nNOME DO LIVRO: %s \n QUANTIDADE: %d", book.getId(), book.getnLivros(), book.getQntd());
				}
				System.out.printf("\nDigite o ID do livro que deseja pegar: ");
				id = ler.nextInt();
				
				Livros l = listaLivros.get(id - 1);
				
				
			}
		}while (opcao != 5);
			
	}

}
