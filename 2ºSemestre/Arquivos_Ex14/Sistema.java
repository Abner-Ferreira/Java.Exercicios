package Arquivos_Ex14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		String nome;
		int unidade;
		Double preco;
		
		
		Scanner sc = new Scanner (System.in);
		
		
		
		String path = "C:\\temp\\Pedidos.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			System.out.println("Quantas pessoas desejam fazer o pedido: ");
			int qtd = sc.nextInt();
			
			
			
			 for (int i = 0 ; i < qtd ; i++) {
				 System.out.println("Digite o nome do cliente");
				 nome = sc.next();
			
				 bw.write(nome);
				 bw.newLine();
				 
				 System.out.println("Quantos produtos deseja comprar: ");
				 int qtdPedido = sc.nextInt();
				 
				 for (int j = 0; j < qtdPedido; j++) {
					 
					 
					 System.out.println("Digite o nome do produto: ");
					 String nomeProduto = sc.next();
					 bw.write(nomeProduto + ",");
					 
					 System.out.println("Digite a unidade do produto: ");
					 unidade = sc.nextInt();
					 bw.write(Integer.toString(unidade)+ ",");
					 
					 
					 System.out.println("Digite o preço do produto: ");
					 preco = sc.nextDouble();
					 bw.write(Double.toString(preco));
					 
					 bw.newLine();
				 }
				 bw.newLine();
			 }
	     }
		  catch(IOException e) {
	           e.printStackTrace();
		  }
		

	}

}
