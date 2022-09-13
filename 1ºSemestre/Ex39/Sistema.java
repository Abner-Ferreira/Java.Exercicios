package Ex39;
import java.util.Scanner;


import java.io.IOException;
import java.util.ArrayList;
public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		
		double saldo = 0 ;
		int opcao;
		int id = 0;
		int idade;
		String nome;
		ContaBancaria conta ;
		String agencia;
		String numero;
		double valorDeposito;
		double valorSaque;
		double valorTransf;
		int idDestinatario;
		
		
		ArrayList <Cliente> listaCliente= new  ArrayList<>();

		do {
			System.out.println("          Banco Macgyver               \n ");
			System.out.println("Escolha um opção: ");
			System.out.printf(" 1 - Criar Cliente / Conta \n 2 - Depósito \n 3 - Saque \n 4 - Transferência \n 5 - Consulta de saldo \n 6 - Sair");
			System.out.printf("\n Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				Cliente cliente = new Cliente();
				
				id = listaCliente.size ()+ 1;
				cliente.setId(id);
				
				System.out.println("Digite o nome do cliente: ");
				nome = ler.next();
				cliente.setNome(nome);
				
				System.out.println(" Digite a idade do cliente: ");
				idade = ler.nextInt();
				cliente.setIdade(idade);
				
				ContaBancaria cb = new ContaBancaria();
				
				System.out.println(" Digite a agência do cliente: ");
				agencia = ler.next();
				cb.setAgencia(agencia);
				
				System.out.println("Digite o número do cliente: ");
				numero = ler.next();
				cb.setNumero(numero);
				
				cliente.setConta(cb);
				
				listaCliente.add(cliente);
				
				System.out.println(" \n Cliente cadastrado com sucesso!");
				System.in.read();
				
			}else if (opcao == 2) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome: %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id da conta para depósito: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o valor a ser depositado: ");
				valorDeposito=ler.nextDouble();
				
				Cliente cliente = listaCliente.get(id-1);
				cliente.getConta().Depositar(valorDeposito);
				
				System.out.printf("Valor depositado com sucesso!");
				System.in.read();
			}else if (opcao == 3) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id da conta para o saque: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o valor a ser sacado: ");
				valorSaque=ler.nextDouble();
				
				Cliente cliente = listaCliente.get(id-1);
				cliente.getConta().Sacar(valorSaque);
				
				System.out.printf("Valor depositado com sucesso!");
				System.in.read();
			}else if (opcao == 4 ) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id da sua contar: ");
				id=ler.nextInt();
				Cliente cliente = listaCliente.get(id-1);
				
				System.out.printf("Digite o valor a ser tranferido: ");
				valorTransf=ler.nextDouble();
				
				if(valorTransf>cliente.getConta().getSaldo()) {
					System.out.printf("Saldo insuficiente para transfêrencia!\n");
				}else {
					
				System.out.printf("Digite o id do destinatário: ");
				idDestinatario=ler.nextInt();
				
				Cliente destinatario = listaCliente.get(idDestinatario-1);
				cliente.getConta().Transferir(valorTransf, destinatario);
				
				System.out.printf("Tranferência realizada com sucesso!\n");
				System.in.read();
				}
				
			}else if(opcao==5) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id da sua conta: ");
				id=ler.nextInt();
				Cliente cliente = listaCliente.get(id-1);
				
				System.out.printf("\nSaldo: R$%.2f\n",cliente.getConta().getSaldo());
				System.in.read();
			}
		}while(opcao != 6);
		
		ler.close();
	}
}
