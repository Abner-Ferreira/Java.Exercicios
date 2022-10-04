package Camadas_Ex24;

import java.sql.SQLException;
import java.util.Scanner;

public class Programa {

	public static void main (String[] args) throws SQLException {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		int opcao;
		
		do {
			
			System.out.println("-------ALUNOS-------");
   			System.out.println("\n1 - Cadastrar Alunos \n2 - Listar Alunos  \n3 - Listar um Único Aluno "
   					+ " \n4 - Atualizar Alunos\n5 - Excluir Alunos\n6 - Sair");
   			System.out.println("Digite a opção que deseja: ");
   			opcao = sc.nextInt();
   			
   			if (opcao == 1) {
   				Aluno a = new Aluno();
   				
   				System.out.println("Digite o nome do aluno: ");
   				a.setNome(sc.next());
   				
   				System.out.println("Digite o ra do aluno: ");
   				a.setRa(sc.next());
   				
   				System.out.println("Digite o curso do aluno: ");
   				a.setCurso(sc.next());
   				
   				AlunoService.InserirAluno(a);
   			}
   			else if (opcao == 2) {
   				AlunoService.ExibirAlunos();
   			}
   			else if (opcao == 3) {
   				System.out.println("Digite o ID do aluno que deseja mostrar: ");
   				AlunoService.ExibirAluno(sc.nextInt());
   			}
   			else if (opcao == 4) {
   				int id; 
   				System.out.println("Digite o ID do aluno a ser atualizado: ");
   				id = sc.nextInt();
   				AlunoService.ExibirAluno(id);
   				
   				Aluno aluno = new Aluno();
   				
   				aluno.setId(id);
   				
   				System.out.println("Digite o novo nome do aluno: ");
   				aluno.setNome(sc.next());
   				
   				System.out.println("Digite o novo ra do aluno: ");
   				aluno.setRa(sc.next());
   				
   				System.out.println("Digite o novo curso do aluno: ");
   				aluno.setCurso(sc.next());
   				
   				AlunoService.AtualizarAluno(aluno);
   				
   			}
   			
   			else if(opcao == 5) {
   				int id;
   				String conf;
   				
   				System.out.println("Digite o ID do aluno a ser excluido: ");
   				id = sc.nextInt();    	   				
   				AlunoService.ExibirAluno(id);
   				
   				System.out.println("Tem certeza que deseja excluir esse aluno? ");
   				conf = sc.next().toUpperCase();
   				
   				if (conf.equals("S")) {
   					AlunoService.ExcluirAluno(id);
   				}
   			}
			
		} while (opcao != 6);
	}
	
	
	
}
