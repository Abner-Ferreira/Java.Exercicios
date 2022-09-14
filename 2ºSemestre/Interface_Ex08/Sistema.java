package Interface_Ex08;

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
			System.out.println("1 - Criar Pessoa Física \n2 - Criar Pessoa Jurídica \n3 - Listar Pessoas Físicas \n4 - Listar Pessoas Juridicas \n5 - Atualizar (Pessoa Física) \n6 - Atualizar (Pessoa Juridicas)");
			System.out.println("Digite a opção desejada: ");
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
				
				System.out.println("Digite o seu gênero (M ou F): ");
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
				
				System.out.println("Digite o endereço da residência (obs: sem o número): ");
				endereco = ler.next();
				pf.setEndereco(endereco);
				
				System.out.println("Digite o número da residência: ");
				numeroEnd = ler.next();
				pf.setNumeroEnd(numeroEnd);
				
				listaPessoaFisica.add(pf);
				
				System.out.println("Pessoa Física cadastrada com sucesso !!");
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
				
				System.out.println("Digite a data de fundação:");
				dtFund = ler.next();
				pj.setDtFund(dtFund);
				
				System.out.println("Digite o número de inscrição: ");
				nrInscri = ler.next();
				pj.setNrInscri(nrInscri);
				
				System.out.println("Digite o endereço da empresa(obs: sem o número): ");
				endereco = ler.next();
				pj.setEndereco(endereco);
				
				System.out.println("Digite o número da empresa: ");
				numeroEnd = ler.next();
				pj.setNumeroEnd(numeroEnd);
				
				listaPessoaJuridica.add(pj);
				
				System.out.println("Pessoa Jurídica cadastrada com sucesso !!");
				System.in.read();
				
			} else if (opcao ==3) {
				System.out.println("---------- LISTAGEM DE PESSOAS FÍSICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaFisica pfs: listaPessoaFisica) {
					System.out.printf("\n ID: %d  NOME: %s  SOBRENOME: %s  IDADE: %d  GENÊRO: %s  RG: %s  CPF: %s  DATA DE NASCIMENTO: %s \n "
							+ "	ENDEREÇO: %s  NÚMERO: %s \n", pfs.getId() ,pfs.getNome(), pfs.getSobrenome(),pfs.getIdade(), pfs.getGenero(), pfs.getRg(), pfs.getCpf(), pfs.getDtNasc(), pfs.getEndereco(), pfs.getNumeroEnd() );
				}
				System.in.read();
			} else if (opcao ==4) {
				System.out.println("---------- LISTAGEM DE PESSOAS JURIDICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaJuridica pjd: listaPessoaJuridica) {
					System.out.printf("\n ID: %d  NOME FANTASIA: %s  CPNJ: %s  DATA DE FUNDAÇÃO: %s  NÚMERO DE INSCRIÇÃO: %s  ENDEREÇO: %s  NÚMERO: %s \n", pjd.getId() ,pjd.getNome(), pjd.getCnpj(), pjd.getDtFund() , pjd.getNrInscri(),pjd.getEndereco(), pjd.getNumeroEnd() );
				}
				System.in.read();
			} else if (opcao ==5) {
				System.out.println("---------- LISTAGEM DE PESSOAS FÍSICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaFisica pfs: listaPessoaFisica) {
					System.out.printf("\n ID: %d  NOME: %s  SOBRENOME: %s  IDADE: %d  GENÊRO: %s  RG: %s  CPF: %s  DATA DE NASCIMENTO: %s \n "
							+ "	ENDEREÇO: %s  NÚMERO: %s \n", pfs.getId() ,pfs.getNome(), pfs.getSobrenome(),pfs.getIdade(), pfs.getGenero(), pfs.getRg(), pfs.getCpf(), pfs.getDtNasc(), pfs.getEndereco(), pfs.getNumeroEnd() );
				}
				System.out.println("Digite o ID da pessoa física que você quer atualizar: ");
				id = ler.nextInt();
				
				System.out.println("O que deseja atualizar?\n"
						+ "1- Nome\n"
						+ "2- Sobrenome\n"
						+ "3- Endereço\n"
						+ "4- Número\n"
						+ "5- Idade\n"
						+ "Digite o número da opção desejada: ");
				opcao = ler.nextInt();
				
				PessoaFisica pf = listaPessoaFisica.get(id-1);
				
				if(opcao ==1) {
					System.out.println("Digite o novo nome da pessoa: ");
					nome = ler.next();
					pf.setNome(nome);
				}else if(opcao ==2) {
					System.out.println("Digite o novo sobrenome da pessoa: ");
					sobrenome = ler.next();
					pf.setSobrenome(sobrenome);
				}else if(opcao ==3) {
					System.out.println("Digite o novo endereço da pessoa: ");
					endereco = ler.next();
					pf.setEndereco(endereco);
				}else if(opcao ==4) {
					System.out.println("Digite o novo número do endereço da pessoa: ");
					numeroEnd = ler.next();
					pf.setNumeroEnd(numeroEnd);
				}else if(opcao ==5) {
					System.out.println("Digite a nova idade da pessoa: ");
					idade = ler.nextInt();
					pf.setIdade(idade);
				}else {
					System.out.println("ERROO ESTA OPÇÃO NÃO EXISTE");
				}
				
				System.out.println("Pessoa Física atualizada com sucesso!");
				System.in.read();
			} else if (opcao ==6) {
				System.out.println("---------- LISTAGEM DE PESSOAS JURIDICAS CADASTRADAS NO SISTEMA ----------");
				for (PessoaJuridica pjd: listaPessoaJuridica) {
					System.out.printf("\n ID: %d  NOME FANTASIA: %s  CPNJ: %s  DATA DE FUNDAÇÃO: %s  NÚMERO DE INSCRIÇÃO: %s  ENDEREÇO: %s  NÚMERO: %s \n", pjd.getId() ,pjd.getNome(), pjd.getCnpj(), pjd.getDtFund() , pjd.getNrInscri(),pjd.getEndereco(), pjd.getNumeroEnd() );
				}
				System.out.println("Digite o ID da pessoa física que você quer atualizar: ");
				id = ler.nextInt();
				
				System.out.println("O que deseja atualizar?\n"
						+ "1- Nome Fantasia\n"
						+ "2- Endereço\n"
						+ "3- Número\n"
						+ "Digite o número da opção desejada: ");
				opcao = ler.nextInt();
				
				PessoaJuridica pj = listaPessoaJuridica.get(id-1);
				
				if(opcao ==1) {
					System.out.println("Digite o novo nome fantasia da pessoa: ");
					nome = ler.next();
					pj.setNome(nome);
				}else if(opcao ==2) {
					System.out.println("Digite o novo endereço da pessoa: ");
					endereco = ler.next();
					pj.setEndereco(endereco);
				}else if(opcao ==3) {
					System.out.println("Digite o novo número do endereço da pessoa: ");
					numeroEnd = ler.next();
					pj.setNumeroEnd(numeroEnd);
				}else {
					System.out.println("ERROO ESTA OPÇÃO NÃO EXISTE");
				}
				
				System.out.println("Pessoa Juridica atualizada com sucesso!");
				System.in.read();
			}
		}while(opcao !=7);
		ler.close();
	}

}
