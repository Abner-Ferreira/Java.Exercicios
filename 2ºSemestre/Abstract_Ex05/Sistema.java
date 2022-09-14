package Abstract_Ex05;

import java.util.Scanner;

import Ex40.Cliente;

import java.io.IOException;
import java.util.ArrayList;

public class Sistema {
	
	public static void main(String[] args) throws IOException {
		
		
				Scanner ler = new Scanner (System.in);

				int opcao;
				int id = 0;
				String agencia;
				String numero;
				double saldo;
				double chequeEspecial;
				String depConta;
				double valor;
				
				ArrayList <ContaCorrente> listaContaCorrente= new  ArrayList<>();
				ArrayList <ContaPoupanca> listaContaPoupanca= new  ArrayList<>();
				ArrayList <ContaSalario> listaContaSalario= new  ArrayList<>();
		        
				do {
					System.out.println("\n ----------> Banco <----------\n ");
					System.out.println("Escolha um op��o: ");
					System.out.printf(" 1 - Criar Conta Corrente \n 2 - Criar Conta Poupan�a \n 3 - Criar Conta Sal�rio \n 4 - Listar Contas Correntes Cadastradas \n 5 - Listar Contas Poupan�as Cadastradas \n 6 - Listar Contas Sal�rio Cadastradas \n 7 - Depositar \n 8 - Sacar \n 9 - Sair \n");
					System.out.printf("\n Digite a op��o desejada: ");
					opcao = ler.nextInt();
					System.out.println();
					
					if (opcao == 1) {
						
						ContaCorrente cc = new ContaCorrente();
						
						id = listaContaCorrente.size ()+ 1;
						cc.setId(id);
						
						System.out.println(" Digite a ag�ncia da conta corrente: ");
						agencia = ler.next();
						cc.setAgencia(agencia);
						
						System.out.println("Digite o n�mero da conta corrente: ");
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
						
						System.out.println(" Digite a ag�ncia da conta poupan�a: ");
						agencia = ler.next();
						cp.setAgencia(agencia);
						
						System.out.println("Digite o n�mero da conta poupan�a: ");
						numero = ler.next();
						cp.setNumero(numero);
						
						saldo = 0;
						cp.setSaldo(saldo);
						
						listaContaPoupanca.add(cp);
						
						System.out.println(" \n Conta poupan�a cadastrada com sucesso!");
						System.in.read();
						
					}else if (opcao == 3) {
						ContaSalario cs = new ContaSalario();
						
						id = listaContaSalario.size ()+ 1;
						cs.setId(id);
						
						System.out.println(" Digite a ag�ncia da conta sal�rio: ");
						agencia = ler.next();
						cs.setAgencia(agencia);
						
						System.out.println("Digite o n�mero da conta sal�rio: ");
						numero = ler.next();
						cs.setNumero(numero);
						
						saldo = 0;
						cs.setSaldo(saldo);
						
						listaContaSalario.add(cs);
						
						System.out.println(" \n Conta sal�rio cadastrada com sucesso!");
						System.in.read();
					}else if (opcao==4) {
						System.out.println("--------LISTAS DE CONTAS CORRENTES CADASTRADAS--------");
						for (ContaCorrente ct : listaContaCorrente) {
							System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s SALDO: %.2f", ct.getId(),ct.getAgencia(), ct.getNumero(), ct.getSaldo() );
						}
						System.in.read();
					}else if (opcao ==5) {
						System.out.println("--------LISTAS DE CONTAS POUPAN�AS CADASTRADAS--------");
						for (ContaPoupanca pp : listaContaPoupanca) {
							System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s  SALDO: %.2f", pp.getId(),pp.getAgencia(), pp.getNumero(),pp.getSaldo() );
						}
						System.in.read();
					}else if (opcao ==6) {
						System.out.println("--------LISTAS DE CONTAS SAL�RIO CADASTRADAS--------");
						for (ContaSalario cs: listaContaSalario) {
							System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s  SALDO: %.2f", cs.getId(),cs.getAgencia(), cs.getNumero(),cs.getSaldo() );
						}
						System.in.read();
					}	else if (opcao ==7) {
						System.out.println("Qual conta quer depositar (corrente, poupan�a ou salario)");
						depConta = ler.next().toUpperCase();
						
						if (depConta.equals("CORRENTE")) {
							for (ContaCorrente ct: listaContaCorrente) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", ct.getId(),ct.getAgencia(), ct.getNumero(), ct.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para dep�sito: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser depositado: ");
							valor=ler.nextDouble();
							
							ContaCorrente cc = listaContaCorrente.get(id-1);
							cc.Depositar(valor);
							
							
							System.out.printf("Valor depositado com sucesso!");
							System.in.read();
						}else if(depConta.equals("POUPAN�A") || depConta.equals("POUPANCA")) {
							for (ContaPoupanca cp: listaContaPoupanca) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", cp.getId(),cp.getAgencia(), cp.getNumero(), cp.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para dep�sito: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser depositado: ");
							valor=ler.nextDouble();
							
							ContaPoupanca cp = listaContaPoupanca.get(id-1);
							cp.Depositar(valor);
							
							
							System.out.printf("Valor depositado com sucesso!");
							System.in.read();
						}else if(depConta.equals("SALARIO") || depConta.equals("SAL�RIO")) {
							for (ContaSalario cs: listaContaSalario) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", cs.getId(),cs.getAgencia(), cs.getNumero(), cs.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para dep�sito: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser depositado: ");
							valor=ler.nextDouble();
							
							ContaSalario cs = listaContaSalario.get(id-1);
							cs.Depositar(valor);
							
							
							System.out.printf("Valor depositado com sucesso!");
							System.in.read();
						}
					}else if (opcao ==8) {
						System.out.println("De qual conta voc� quer sacar (corrente, poupan�a ou sal�rio)? ");
						depConta = ler.next().toUpperCase();
						if (depConta.equals("CORRENTE")) {
							for (ContaCorrente ct: listaContaCorrente) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", ct.getId(),ct.getAgencia(), ct.getNumero(), ct.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para saque: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser sacado: ");
							valor=ler.nextDouble();
							
							ContaCorrente cc = listaContaCorrente.get(id-1);
							cc.Sacar(valor);
							
							
							System.out.printf("Valor sacado com sucesso!");
							System.in.read();
						}else if(depConta.equals("POUPAN�A") || depConta.equals("POUPANCA")) {
							for (ContaPoupanca cp: listaContaPoupanca) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", cp.getId(),cp.getAgencia(), cp.getNumero(), cp.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para saque: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser sacado: ");
							valor=ler.nextDouble();
							
							ContaPoupanca cp = listaContaPoupanca.get(id-1);
							cp.Sacar(valor);
							
							
							System.out.printf("Valor sacado com sucesso!");
							System.in.read();
						}else if(depConta.equals("SALARIO") || depConta.equals("SAL�RIO")) {
							for (ContaSalario cs: listaContaSalario) {
								System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s Saldo: %.2f", cs.getId(),cs.getAgencia(), cs.getNumero(), cs.getSaldo() );
							}
							System.out.printf("\nDigite o id da conta para saque: ");
							id=ler.nextInt();
							
							System.out.printf("Digite o valor a ser sacado: ");
							valor=ler.nextDouble();
							
							ContaSalario cs = listaContaSalario.get(id-1);
							cs.Sacar(valor);
							
							
							System.out.printf("Valor sacado com sucesso!");
							System.in.read();
						}
						
					}
					
				}while (opcao != 9);
			}

		}
