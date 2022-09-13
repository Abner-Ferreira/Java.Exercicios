package Ex37;

import java.util.Scanner;



import java.util.ArrayList;
import java.io.IOException;

public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);

		ArrayList<Cliente> listaCliente = new ArrayList<>();
		
		int opcao;
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String possuiConta;
		String agencia;
		String numero;
		double saldo;
		
		do {
			System.out.println("==> SISTEMAS DE CADASTRO DE CLIENTES <==");
			System.out.println("\n Escolha uma opção: ");
			System.out.printf("  1 - Incluir Cliente \n " + " 2 - Alterar Cliente \n " + " 3 - Excluir Cliente \n " + " 4 - Exibir Clientes \n" + "  5 - Sair \n");
			System.out.println("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Cliente cliente = new Cliente();
				
				id = listaCliente.size() + 1;
				cliente.setId(id);
				
				System.out.println("Digite o nome do cliente: ");
				nome = ler.next();
				cliente.setNome(nome);
				
				System.out.println("Digite a idade do cliente: ");
				idade = ler.nextInt();
				cliente.setIdade(idade);
				
				System.out.println("Digite o email do cliente: ");
				email = ler.next();
				cliente.setEmail(email);
				
				System.out.println("O cliente possui conta bancária (S/N) ? ");
				possuiConta = ler.next().toUpperCase();
				
				if (possuiConta.equals("S")) {
					
					ContaBancaria cb = new ContaBancaria();
					
					System.out.println("Digite a agência do cliente: ");
					agencia = ler.next();
					cb.setAgencia(agencia);
					System.out.println("Digite o número do cliente: ");
					numero = ler.next();
					cb.setNumero(numero);
					System.out.println("Digite o saldo do cliente: ");
					saldo = ler.nextDouble();
					cb.setSaldo(saldo);
					
					cliente.setContaBancaria(cb);
					
				}else {
					 conta = null;
				}
				
				
				listaCliente.add(cliente);
				
				System.out.println("Cliente adicionado com sucesso!");
				
				System.in.read();
			}
			
			else if (opcao == 2) {
				for (Cliente c : listaCliente) {
					System.out.printf("Id: %d - Nome: %s - Idade: %d - Email: %s \n %s \n" ,  c.getId() , c.getNome(), c.getIdade(), c.getEmail(), c.getExibirDadosConta());
					
				}
				System.out.println("\nDigite o id do cliente que deseja atualizar: ");
				id= ler.nextInt();
				
				System.out.println("Digite o novo nome do cliente: ");
				nome = ler.next();
				System.out.println("Digite a nova idade do cliente: ");
				idade = ler.nextInt();
				System.out.println("Digite o novo email do cliente: ");
				email = ler.next();
				
				Cliente cliente = listaCliente.get(id-1);
				
				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setEmail(email);
				
				System.out.println("Cliente atualizado com sucesso! ");
				
				System.in.read();
			}
			
			else if (opcao == 3) {
				for (Cliente c : listaCliente) {
					System.out.printf("Id: %d - Nome: %s - Idade: %d - Email: %s \n %s \n" ,  c.getId() , c.getNome(), c.getIdade(), c.getEmail(), c.getExibirDadosConta());
					
				}
				System.out.println("Digite o id do cliente que deseja excluir: ");
				id = ler.nextInt();
				
				listaCliente.remove(id-1);
				
				System.in.read();
			}
			
			else if (opcao == 4) {
				for (Cliente c : listaCliente) {
					System.out.printf("Id: %d - Nome: %s - Idade: %d - Email: %s \n %s \n" ,  c.getId() , c.getNome(), c.getIdade(), c.getEmail(), c.getExibirDadosConta());
					
				}
				System.in.read();
			}
			
		} while (opcao != 5);
		
		
		ler.close();
	}
}
