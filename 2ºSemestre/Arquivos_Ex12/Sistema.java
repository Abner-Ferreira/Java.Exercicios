package Arquivos_Ex12;

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
		
		
		
		String path = "C:\\temp\\Lista.txt";
		
		
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			 
			 for (int i = 0 ; i < 10 ; i++) {
				 System.out.println("Digite o nome do produto: ");
				 nome = sc.next();
			
				 bw.write(nome + ",");
				 
				 System.out.println("Digite a unidade do produto: ");
				 unidade = sc.nextInt();
				 bw.write(Integer.toString(unidade)+ ",");
		
				 
				 System.out.println("Digite o preço do produto: ");
				 preco = sc.nextDouble();
				 bw.write(Double.toString(preco));
			
				 
				 bw.newLine();
			 }
	     }
		  catch(IOException e) {
	           e.printStackTrace();
		  }
		
	}
}
	