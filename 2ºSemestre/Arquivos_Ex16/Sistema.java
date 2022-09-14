package Arquivos_Ex16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	public static void main(String[] args) throws IOException {
	
		ArrayList  <String> nomes = new ArrayList<>();
		ArrayList  <String> produtos = new ArrayList<>();
		ArrayList  <Double> Unidades= new ArrayList<>();
		ArrayList  <Double> valorUni= new ArrayList<>();
		ArrayList <Double> total = new ArrayList<>();
		ArrayList <Integer> item = new ArrayList<>();
		
		String path = "C:\\temp\\Pedidos.txt";
		
		Scanner sc = new Scanner (System.in);
		
		double valorAux;
		double valor;
		String nome;
		int i;
		int j ;
		int cont = 0;
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				produtos.add(line);
				line = br.readLine();
			
			}
		
			String listaNome[] = produtos.toString().split(",");
			produtos.clear();
		
			System.out.println("Quantos pedidos tem no arquivo? ");
			int qtd = sc.nextInt();
			
			i=0;
			while(i < listaNome.length ) {
				
			
				if (listaNome[i].endsWith("0")||listaNome[i].endsWith("1")||listaNome[i].endsWith("2")
						||listaNome[i].endsWith("3")||listaNome[i].endsWith("4")||listaNome[i].endsWith("5")
						||listaNome[i].endsWith("6")||listaNome[i].endsWith("7")||listaNome[i].endsWith("8")
						||listaNome[i].endsWith("9")) {
					
					valor = (Float.parseFloat(listaNome[i]));
					Unidades.add(valor);			
					
				}else {
					nome = listaNome[i];
					produtos.add(nome);
				
				}			
				i++;
			}

			for (j = 0; j < Unidades.size(); j = j +2) {
				valor = Unidades.get(j);
				valorUni.add(valor);	
			}
			
			while ( cont < Unidades.size() ) {
				Unidades.remove(cont);
				cont += 1;
			}
			
			for (i = 0; i < valorUni.size(); i++) {
				valorAux = valorUni.get(i);
				valor = Unidades.get(i);
				total.add(valorAux*valor);
			}
			
			
			nomes.add(produtos.get(0));
			produtos.remove(0);
			for (i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).isBlank()) {
					nomes.add(produtos.get(i+1));
					produtos.remove(i+1);

				}
				
			}
	
			int aux=0;
			j=1;
			valor= 0 ;
			int contador=0; 
			valorUni.clear();
			for (i = 0 ; i < qtd ; i++) {
				System.out.println("Quantos items tem no pedido do " + j+"º Cliente: ");
				int items = sc.nextInt();
				while (aux < items) {
					valor += total.get(aux);
					aux++;

				}
				valorUni.add(valor);
				j++;
			}
		

			
		}catch(IOException e) {
           e.printStackTrace();
		}finally {
			for (i = 0; i < nomes.size()+2; i++) {
				System.out.println(nomes.get(i)+","+valorUni.get(i));
			}
			
		
		} 
		
	}

}
