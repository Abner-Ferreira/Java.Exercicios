package Tratamentos_Ex11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nome;
		String framework;
		String descricaoLinguagem;
		String descricaoFramework;
		String web;
		String mobile;
		
		ArrayList<FrontEnd>  frontend = new ArrayList<>();
		ArrayList<BackEnd>  backend = new ArrayList<>();
		System.out.println("Quantas tecnologias deseja criar? ");
		int qtd = sc.nextInt();
		
		for (int i = 0 ; i < qtd; i++) {
			System.out.println("Deseja criar uma tecnologia front ou beckend (front ou back) ? ");
			String linguagem = sc.next().toUpperCase();
			
			if (linguagem.equals("FRONT")) {
				FrontEnd fe = new FrontEnd();
				
				System.out.println("Nome da linguagem: ");
				nome = sc.next();
				fe.setNome(nome);
				
				System.out.println("Principal FrameWork: ");
				framework = sc.next();
				fe.setFramework(framework);
				System.out.println("Descreva a sua linguagem: ");
				descricaoLinguagem = sc.next();
				fe.setLinguagem(descricaoLinguagem);
				System.out.println("Descreva p seu framework: ");
				descricaoFramework = sc.next();
				fe.setMainFramework(descricaoFramework);
				
				System.out.println("É compatível com web: ");
				web = sc.next();
				fe.setWeb(web);
				
				System.out.println("É compatível com mobile: ");
				mobile = sc.next();
				fe.setMobile(mobile);
				
				frontend.add(fe);
			}else if (linguagem.equals("BACK")) {
				BackEnd be= new BackEnd();
				
				System.out.println("Nome da linguagem: ");
				nome = sc.next();
				be.setNome(nome);
				
				System.out.println("Principal FrameWork: ");
				framework = sc.next();
				be.setFramework(framework);
				System.out.println("Descreva a sua linguagem: ");
				descricaoLinguagem = sc.next();
				be.setLinguagem(descricaoLinguagem);
				System.out.println("Descreva p seu framework: ");
				descricaoFramework = sc.next();
				be.setMainFramework(descricaoFramework);
				
				System.out.println("É compatível com web: ");
				web = sc.next();
				be.setWeb(web);
				
				System.out.println("É compatível com mobile: ");
				mobile = sc.next();
				be.setMobile(mobile);
				
				
				backend.add(be);
			}else {
				System.out.println("ESSA OPCAO NAO EXISTE");
			}
		}
		
		if (!frontend.isEmpty()) {
			System.out.println("\n -----FRONTEND-----");
			for (FrontEnd fe: frontend) {
				System.out.printf("\nNome: %s  Principal Framework: %s \n "
						+ "Descrição Linguagem: %s  Descrição Framework: %s \n"
						+ "Compatível com web: %s  Compatível com mobile: %s \n", fe.getNome(), fe.getFramework(), fe.getLinguagem(), fe.getMainFramework(), fe.getWeb(), fe.getMobile());
			}
		}if (!backend.isEmpty()) {
				System.out.println("\n -----BACKEND-----");
				for (BackEnd be: backend) {
					System.out.printf("\nNome: %s  Principal Framework: %s \n "
							+ "Descrição Linguagem: %s  Descrição Framework: %s \n"
							+ "Compatível com web: %s  Compatível com mobile: %s \n", be.getNome(), be.getFramework(), be.getLinguagem(), be.getMainFramework(),be.getWeb(), be.getMobile());
				}
		}
	}

}
