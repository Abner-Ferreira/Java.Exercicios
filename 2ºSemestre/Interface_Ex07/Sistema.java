package Interface_Ex07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Sistema {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);

		int opcao;
		int id = 0;
		String agencia;
		String numero;
		double saldo;
		String escolha;
		double valorDeposito;
		
		
		ArrayList <ContaCorrente> listaContaCorrente= new  ArrayList<>();
		ArrayList <ContaPoupanca> listaContaPoupanca= new  ArrayList<>();
		ArrayList <ContaSalario> listaContaSalario= new  ArrayList<>();
        
		do {
			System.out.println("\n ----------> Banco <----------\n ");
			System.out.println("Escolha um opção: ");
			System.out.printf(" 1 - Criar Conta Corrente \n 2 - Criar Conta Poupança \n 3 - Criar Conta Salário \n 4 - Listar Contas Correntes Cadastradas \n 5 - Listar Contas Poupanças Cadastradas \n 6 - Listar Contas Salário Cadastradas \n 7 - Depositar na Conta Corrente \n 8 - Depositar na Conta Poupança \n 9 - Depositar na Conta Salário \n 10 - Sacar \n 11 - Sair");
			System.out.printf("\n Digite a opção desejada: ");
			opcao = ler.nextInt();
			System.out.println();
			
			if (opcao == 1) {
				
				ContaCorrente cc = new ContaCorrente();
				
				id = listaContaCorrente.size ()+ 1;
				cc.setId(id);
				
				System.out.println(" Digite a agência da conta corrente: ");
				agencia = ler.next();
				cc.setAgencia(agencia);
				
				System.out.println("Digite o número da conta corrente: ");
				numero = ler.next();
				cc.setNumero(numero);
				
				saldo = 0;
				cc.setSaldo(saldo);
				
				listaContaCorrente.add(cc);
				
				System.out.println(" \n Conta corrente cadastrada com sucesso!");
				
				System.in.read();
			}else if (opcao == 2) {
			
				ContaPoupanca cp = new ContaPoupanca();
				
				id = listaContaPoupanca.size ()+ 1;
				cp.setId(id);
				
				System.out.println(" Digite a agência da conta poupança: ");
				agencia = ler.next();
				cp.setAgencia(agencia);
				
				System.out.println("Digite o número da conta poupança: ");
				numero = ler.next();
				cp.setNumero(numero);
				
				saldo = 0;
				cp.setSaldo(saldo);
				
				listaContaPoupanca.add(cp);
				
				System.out.println(" \n Conta poupança cadastrada com sucesso!");
				System.in.read();
				
			}else if (opcao == 3) {
				ContaSalario cs = new ContaSalario();
				
				id = listaContaSalario.size ()+ 1;
				cs.setId(id);
				
				System.out.println(" Digite a agência da conta salário: ");
				agencia = ler.next();
				cs.setAgencia(agencia);
				
				System.out.println("Digite o número da conta salário: ");
				numero = ler.next();
				cs.setNumero(numero);
				
				saldo = 0;
				cs.setSaldo(saldo);
				
				listaContaSalario.add(cs);
				
				System.out.println(" \n Conta salário cadastrada com sucesso!");
				System.in.read();
			}else if (opcao==4) {
				System.out.println("--------LISTAS DE CONTAS CORRENTES CADASTRADAS--------");
				for (ContaCorrente ct : listaContaCorrente) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", ct.getId(),ct.getAgencia(), ct.getNumero(), ct.getSaldo() );
				}
				System.in.read();
			}else if (opcao ==5) {
				System.out.println("--------LISTAS DE CONTAS POUPANÇAS CADASTRADAS--------");
				for (ContaPoupanca pp : listaContaPoupanca) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", pp.getId(),pp.getAgencia(), pp.getNumero(), pp.getSaldo() );
				}
				System.in.read();
			}else if (opcao ==6) {
				System.out.println("--------LISTAS DE CONTAS SALÁRIO CADASTRADAS--------");
				for (ContaSalario cs: listaContaSalario) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", cs.getId(),cs.getAgencia(), cs.getNumero(), cs.getSaldo() );
				}
				System.in.read();
				
			}else if (opcao==7) {
				System.out.println("--------LISTAS DE CONTAS CORRENTES CADASTRADAS--------");
				for (ContaCorrente ct : listaContaCorrente) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", ct.getId(),ct.getAgencia(), ct.getNumero(), ct.getSaldo());
				}
				System.out.printf("\nDigite o id da conta para depósito: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o valor a ser depositado: ");
				valorDeposito=ler.nextDouble();
				
				ContaCorrente ct = listaContaCorrente.get(id-1);
				ct.Depositar(valorDeposito);
				
				System.out.printf("Valor depositado com sucesso!");
			}else if (opcao == 8) {
				System.out.println("--------LISTAS DE CONTAS POUPANÇAS CADASTRADAS--------");
				for (ContaPoupanca pp : listaContaPoupanca) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", pp.getId(),pp.getAgencia(), pp.getNumero(), pp.getSaldo() );
				}
				System.out.printf("\nDigite o id da conta para depósito: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o valor a ser depositado: ");
				valorDeposito=ler.nextDouble();
				
				ContaPoupanca cp= listaContaPoupanca.get(id-1);
				cp.Depositar(valorDeposito);
				
				System.out.printf("Valor depositado com sucesso!");
			} else if (opcao == 9) {
				System.out.println("--------LISTAS DE CONTAS SALÁRIO CADASTRADAS--------");
				for (ContaSalario cs: listaContaSalario) {
					System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f", cs.getId(),cs.getAgencia(), cs.getNumero(), cs.getSaldo() );
				}
				System.out.printf("\nDigite o id da conta para depósito: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o valor a ser depositado: ");
				valorDeposito=ler.nextDouble();
				
				ContaSalario cs= listaContaSalario.get(id-1);
				cs.Depositar(valorDeposito);
			}
			else if(opcao==10) {
				System.out.println("Digite qual de qual conta quer sacar (corrente/salario/poupanca): ");
				escolha = ler.next().toLowerCase();
				
				if (escolha.equals("corrente")) {
					for (ContaCorrente cc: listaContaCorrente) {
						System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f \n", cc.getId(),cc.getAgencia(), cc.getNumero(), cc.getSaldo());
					}
					System.out.println("Escolha o ID da conta que deseja sacar: \n");
					id=ler.nextInt();
					
					System.out.println("Digite o valor a ser sacado: \n");
					float valorSaque = ler.nextFloat();
					
					ContaCorrente cc = listaContaCorrente.get(id - 1);
					cc.Sacar(valorSaque);
					
					System.out.println("Valor sacado com sucesso!!");
					System.in.read();
				}
				else if (escolha.equals("salario") || (escolha.equals("salário"))) {
					for (ContaSalario cs: listaContaSalario) {
						System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f \n", cs.getId(),cs.getAgencia(), cs.getNumero(), cs.getSaldo());
					}
					System.out.println("Escolha o ID da conta que deseja sacar: \n");
					id=ler.nextInt();
					
					System.out.println("Digite o valor a ser sacado: \n");
					float valorSaque = ler.nextFloat();
					
					ContaSalario cs = listaContaSalario.get(id - 1);
					cs.Sacar(valorSaque);
					
					System.out.println("Valor sacado com sucesso!!");
					System.in.read();
				}
				else if (escolha.equals("poupanca")|| (escolha.equals("poupança"))) {
					for (ContaPoupanca cp: listaContaPoupanca) {
						System.out.printf("\n ID: %d Agência: %s Número: %s Saldo: %.2f \n", cp.getId(),cp.getAgencia(), cp.getNumero(), cp.getSaldo());
					}
					System.out.println("Escolha o ID da conta que deseja sacar: \n");
					id=ler.nextInt();
					
					System.out.println("Digite o valor a ser sacado: \n");
					float valorSaque = ler.nextFloat();
					
					ContaPoupanca cp = listaContaPoupanca.get(id - 1);
					cp.Sacar(valorSaque);
					
					System.out.println("Valor sacado com sucesso!!");
					System.in.read();
				}
			}	
			
		}while (opcao != 11);
	}

}
