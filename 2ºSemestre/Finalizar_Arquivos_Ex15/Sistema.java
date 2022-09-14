package Finalizar_Arquivos_Ex15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sistema {
	
	public static void main(String[] args) throws IOException {
	
		ArrayList  <String> nomes = new ArrayList<>();
		ArrayList  <String> produtos = new ArrayList<>();
		ArrayList  <Double> Unidades= new ArrayList<>();
		ArrayList  <Double> valorUni= new ArrayList<>();
		ArrayList <Double> total = new ArrayList<>();
		
		String path = "C:\\temp\\Pedidos.txt";
		String newPath = "C:\\temp\\Itens-Pedidos.txt";
		
		double valorAux;
		double valor;
		String nome;
		int i = 0;
		int j ;
		int cont = 0;
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
			String line = br.readLine();
			
			while (line != null) {
				produtos.add(line);
				line = br.readLine();
			
			}
		
			String listaNome[] = produtos.toString().split(",");
			produtos.clear();
		
			
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
	
			for (i = 0 ; i < nomes.size()-1; i++) {
				bw.write(nomes.get(i));
				bw.newLine();
				
				j=0;
				
				while( j < total.size() ){
					bw.write(produtos.get(j)+",");
					produtos.remove(j);
					
					if (produtos.get(j).isBlank()) {
						produtos.remove(j);
						bw.newLine();
						break;
					}
					bw.write(Double.toString(total.get(j)));
				
					bw.newLine();
				
					
				}
			}
		
			
		}catch(IOException e) {
           e.printStackTrace();
		}finally {
			System.out.println(total);
			System.out.println(nomes);
			System.out.println(produtos);
		} 
		
	}

}
