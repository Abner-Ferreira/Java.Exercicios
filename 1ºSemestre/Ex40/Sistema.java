package Ex40;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);
		Random rand = new Random();
		
		double saldo  ;
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
		double limite;
		int idDestinatario;
		
		ArrayList <Cliente> listaCliente = new  ArrayList<>();
//		ArrayList <String> extrato = new  ArrayList<>();
		
		do {
			System.out.println("          Banco Macgyver               \n ");
			System.out.println("Escolha um opção: ");
			System.out.printf(" 1 - Criar Cliente / Conta \n 2 - Depósito \n 3 - Saque \n 4 - Transferência \n 5 - Consulta de saldo \n 6 - Extrato \n 7 - Sair \n");
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
				
				
				cb.setAgencia("4422");
				
				int n = rand.nextInt(1000);
				cb.setNumero(Integer.toString(n));
				
				cb.setLimite(75);
				
				ArrayList <String> extrato = new  ArrayList<>();
				cb.setExtrato(extrato);
				
				cliente.setConta(cb);
				
				listaCliente.add(cliente);
				
				System.out.println(" \n Cliente cadastrado com sucesso!");
				System.in.read();
				
			}else if (opcao == 2) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome: %s Idade: %d Agência: %s Número: %s  Saldo: %.2f", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().ConsultarSaldo() );
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
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s Saldo: %.2f", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().ConsultarSaldo());
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
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s Saldo: %.2f", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().ConsultarSaldo() );
				}
				System.out.printf("\nDigite o id do cliente emissor: ");
				id=ler.nextInt();
				
				Cliente cliEmissor = listaCliente.get(id-1);
				
				System.out.printf("\n Digite o id do destinatario: ");
				id=ler.nextInt();
				
				Cliente cliDestinatario = listaCliente.get(id-1);
				
				System.out.printf("Digite o valor a ser tranferido: ");
				valorTransf=ler.nextDouble();
			
				cliEmissor.getConta().Transferir(valorTransf, cliDestinatario);
				
				System.out.println("Valor transferido com sucesso!");
								
				System.in.read();
				
				
			}else if(opcao==5) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id do cliente que deseja consultar o saldo: ");
				id=ler.nextInt();
				
				Cliente cli = listaCliente.get(id-1);
							
				System.out.printf("Saldo : %.2f", cli.getConta().ConsultarSaldo());
				
								
				System.in.read();
			}else if(opcao==6) {
				for (Cliente c : listaCliente) {
					System.out.printf("\n ID: %d Nome : %s Idade: %d Agência: %s Número: %s ", c.getId(), c.getNome(), c.getIdade(), c.getConta().getAgencia(), c.getConta().getNumero() );
				}
				System.out.printf("\nDigite o id do cliente que deseja consultar o extrato: ");
				id=ler.nextInt();
				
				Cliente cli = listaCliente.get(id-1);
							
				System.out.printf("Extrato : %s", cli.getConta().ConsultarExtrato());
				
								
				System.in.read();
			
			}	
		}while(opcao != 7);
	}

}
