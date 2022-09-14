package Heranca_Ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner (System.in);

		int opcao;
		int id = 0;
		String agencia;
		String numero;
		double saldo;
		double chequeEspecial;
		
		ArrayList <ContaCorrente> listaContaCorrente= new  ArrayList<>();
		ArrayList <ContaPoupanca> listaContaPoupanca= new  ArrayList<>();
		ArrayList <ContaSalario> listaContaSalario= new  ArrayList<>();
        
		do {
			System.out.println("\n ----------> Banco <----------\n ");
			System.out.println("Escolha um op��o: ");
			System.out.printf(" 1 - Criar Conta Corrente \n 2 - Criar Conta Poupan�a \n 3 - Criar Conta Sal�rio \n 4 - Listar Contas Correntes Cadastradas \n 5 - Listar Contas Poupan�as Cadastradas \n 6 - Listar Contas Sal�rio Cadastradas \n 7 - Sair \n");
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
				
			
				
				listaContaSalario.add(cs);
				
				System.out.println(" \n Conta sal�rio cadastrada com sucesso!");
				System.in.read();
			}else if (opcao==4) {
				System.out.println("--------LISTAS DE CONTAS CORRENTES CADASTRADAS--------");
				for (ContaCorrente ct : listaContaCorrente) {
					System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s ", ct.getId(),ct.getAgencia(), ct.getNumero() );
				}
				System.in.read();
			}else if (opcao ==5) {
				System.out.println("--------LISTAS DE CONTAS POUPAN�AS CADASTRADAS--------");
				for (ContaPoupanca pp : listaContaPoupanca) {
					System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s ", pp.getId(),pp.getAgencia(), pp.getNumero() );
				}
				System.in.read();
			}else if (opcao ==6) {
				System.out.println("--------LISTAS DE CONTAS SAL�RIO CADASTRADAS--------");
				for (ContaSalario cs: listaContaSalario) {
					System.out.printf("\n ID: %d Ag�ncia: %s N�mero: %s ", cs.getId(),cs.getAgencia(), cs.getNumero() );
				}
				System.in.read();
			}		
			
		}while (opcao != 7);
	}

}
