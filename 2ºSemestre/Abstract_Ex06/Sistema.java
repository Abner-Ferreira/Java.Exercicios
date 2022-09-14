package Abstract_Ex06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner (System.in);
		
		int id=0;
		int opcao;
		String rg;
		int idade;
		String cpf;
		String dtNasc;
		String genero;
		String cnpj;
		String dtFund;
		String nrInscri;
		String sobrenome;
		String nome;
		String endereco;
		String numeroEnd;
		
		
		
		ArrayList<PessoaFisica> listaPessoaFisica = new ArrayList<>();
		ArrayList<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
		
		
		do {
			System.out.println("-------- BEM VINDO AO SISTEMA DE PESSOAS --------");
			System.out.println("1 - Criar Pessoa F�sica \n2 - Criar Pessoa Jur�dica \n3 - Listar Pessoas F�sicas \n4 - Listar Pessoas Juridicas \n5 - Sair");
			System.out.println("Digite a op��o desejada: ");
			opcao = ler.nextInt();
			
			if (opcao ==1) {
				
				PessoaFisica pf = new PessoaFisica();
				
				id = listaPessoaFisica.size()+1;
				pf.setId(id);
				
				System.out.println("Digite o seu nome: ");
				nome = ler.next();
				pf.setNome(nome);
				
				System.out.println("Digite o seu sobrenome: ");
				sobrenome = ler.next();
				pf.setSobrenome(sobrenome);
				
				System.out.println("Digite a sua idade: ");
				idade = ler.nextInt();
				pf.setIdade(idade);
				
				System.out.println("Digite o seu g�nero (M ou F): ");
				genero = ler.next().toUpperCase();
				pf.setGenero(genero);
				
				System.out.println("Digite o seu RG: ");
				rg = ler.next();
				pf.setRg(rg);
				
				System.out.println("Digite o seu CPF: ");
				cpf = ler.next();
				pf.setCpf(cpf);
				
				System.out.println("Digite a sua data de nascimento (dd/mm/ano) : ");
				dtNasc = ler.next();
				pf.setDtNasc(dtNasc);
				
				System.out.println("Digite o endere�o da resid�ncia (obs: sem o n�mero): ");
				endereco = ler.next();
				pf.setEndereco(endereco);
				
				System.out.println("Digite o n�mero da resid�ncia: ");
				numeroEnd = ler.next();
				pf.setNumeroEnd(numeroEnd);
				
				listaPessoaFisica.add(pf);
				
				System.out.println("Pessoa F�sica cadastrada com sucesso !!");
				System.in.read();
				
			} else if (opcao ==2) {
				PessoaJuridica pj = new PessoaJuridica();
				
				id = listaPessoaJuridica.size ()+1;
				pj.setId(id);
				
				System.out.println("Digite o nome fantasia: ");
				nome = ler.next();
				pj.setNome(nome);
				
				System.out.println("Digite o CNPJ: ");
				cnpj = ler.next();
				pj.setCnpj(cnpj);
				
				System.out.println("Digite a data de funda��o:");
				dtFund = ler.next();
				pj.setDtFund(dtFund);
				
				System.out.println("Digite o n�mero de inscri��o: ");
				nrInscri = ler.next();
				pj.setNrInscri(nrInscri);
				
				System.out.println("Digite o endere�o da empresa(obs: sem o n�mero): ");
				endereco = ler.next();
				pj.setEndereco(endereco);
				
				System.out.println("Digite o n�mero da empresa: ");
				numeroEnd = ler.next();
				pj.setNumeroEnd(numeroEnd);
				
				listaPessoaJuridica.add(pj);
				
				System.out.println("Pessoa Jur�dica cadastrada com sucesso !!");
				System.in.read();
				
			} else if (opcao ==3) {
				System.out.println("---------- LISTAGEM DE PESSOAS F�SICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaFisica pfs: listaPessoaFisica) {
					System.out.printf("\n ID: %d  NOME: %s  SOBRENOME: %s  IDADE: %d  GEN�RO: %s  RG: %s  CPF: %s  DATA DE NASCIMENTO: %s \n "
							+ "	ENDERE�O: %s  N�MERO: %s \n", pfs.getId() ,pfs.getNome(), pfs.getSobrenome(),pfs.getIdade(), pfs.getGenero(), pfs.getRg(), pfs.getCpf(), pfs.getDtNasc(), pfs.getEndereco(), pfs.getNumeroEnd() );
				}
				System.in.read();
			} else if (opcao ==4) {
				System.out.println("---------- LISTAGEM DE PESSOAS JURIDICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaJuridica pjd: listaPessoaJuridica) {
					System.out.printf("\n ID: %d  NOME FANTASIA: %s  CPNJ: %s  DATA DE FUNDA��O: %s  N�MERO DE INSCRI��O: %s  ENDERE�O: %s  N�MERO: %s \n", pjd.getId() ,pjd.getNome(), pjd.getCnpj(), pjd.getDtFund() , pjd.getNrInscri(),pjd.getEndereco(), pjd.getNumeroEnd() );
				}
				System.in.read();
			}
		}while(opcao !=5);
		
	}

}
