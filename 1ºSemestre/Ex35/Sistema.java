package Ex35;
import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Cliente[]ListaCliente= new Cliente[5];
		
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String possuiConta;
		String AtualizarEmail;
		String agencia;
		String numero;
		double saldo;
		String novoEmail;
		
		for (int i = 0 ; i<5 ; i++) {
			Cliente c = new Cliente();
			
			System.out.println("Digite o seu id: ");
			id = ler.nextInt();
			c.setId(id);
			
			System.out.println("Digite o seu nome: ");
			nome = ler.next();
			c.setNome(nome);
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			c.setIdade(idade);
			
			System.out.println("Digite o seu email:");
			email = ler.next();
			c.setEmail(email);
			
			System.out.println("Possui conta bancária (S/N): ");
			possuiConta = ler.next().toUpperCase();
			
			if (possuiConta.equals("S")) {
				
				ContaBancaria cb = new ContaBancaria();
							
				System.out.printf("Digite sua agência: ");
				agencia = ler.next();
				cb.setAgencia(agencia);
				System.out.printf("Digite o número da conta: ");
				numero = ler.next();
				cb.setNumero(numero);
				System.out.printf("Digite o seu saldo: ");
				saldo = ler.nextDouble();
				cb.setSaldo(saldo);
				
				c.setContaBancaria(cb);
			}else {	
				conta = null;	
			}
			
	
			ListaCliente[i] = c;
			
			
		}
		for (int i = 0 ; i< 5 ; i++) {
			
			
			System.out.println("\nDeseja atualizar seu email (S/N)? ");
			AtualizarEmail = ler.next().toUpperCase();
			
			if(AtualizarEmail.equals("S")) {
				System.out.println("Digite o novo email do cliente: ");
				novoEmail = ler.next();

				ListaCliente[i].setAtualizarEmail(novoEmail);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s", ListaCliente[i].getEmail());
			}
			System.out.printf("\n %s", ListaCliente[i].getExibirNomeIdade());
			System.out.printf("\n %s", ListaCliente[i].getExibirDadosConta());
			
		}
		
		ler.close();
	}

}
