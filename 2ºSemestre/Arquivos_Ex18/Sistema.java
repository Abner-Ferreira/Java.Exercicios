package Arquivos_Ex18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sistema {
	
	public static void main(String[] args) throws IOException {
	
		ArrayList  <String> cliente = new ArrayList<>();
		ArrayList  <String> produto= new ArrayList<>();
		ArrayList  <String> cidade= new ArrayList<>();
		ArrayList <Double> numero= new ArrayList<>();
		ArrayList <Double> idade= new ArrayList<>();
		ArrayList <Double> qtd = new ArrayList<>();
		ArrayList <Double> preco = new ArrayList<>();
		
		String path = "C:\\temp\\Base.txt";
		String newPath = "C:\\temp\\newBase.txt";
		
		
		
		String clientes;
		String produtos;
		String cidades;
		double numeros;
		int i = 0;
		int j = 0;
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
			String line = br.readLine();
			
			while (line != null) {
				cliente.add(line);
				line = br.readLine();
				
			}	
			String listaCliente[] = cliente.toString().split(",");
			cliente.clear();
		
			while (i < 31) {
				if(listaCliente[i].startsWith(" C")|| i==0) {
					clientes = listaCliente[i];
					cliente.add(clientes);	
				}else if (listaCliente[i].startsWith(" P")) {
					produtos = listaCliente[i];
					produto.add(produtos);
				}else if(listaCliente[i].startsWith("S")) {
					cidades = listaCliente[i];
					cidade.add(cidades);
				}else if(listaCliente[i].startsWith("0")||listaCliente[i].startsWith("1")||listaCliente[i].startsWith("2")||listaCliente[i].startsWith("3")||
						listaCliente[i].startsWith("4")||listaCliente[i].startsWith("5")||listaCliente[i].startsWith("6")||
						listaCliente[i].startsWith("7")||listaCliente[i].startsWith("8")||listaCliente[i].startsWith("9")) {
					numeros = (Double.parseDouble(listaCliente[i]));
					qtd.add(numeros);
					if(j < 5) {
						idade.add(qtd.get(j));
						j++;
					}
				}
				i++;
			}
			
			bw.write("Clientes: ");
			bw.newLine();
			bw.newLine();
			
			for (i = 0; i < cliente.size(); i++) {
				bw.write("Nome: " + cliente.get(i).replace("C", " "));
				bw.newLine();
				bw.write("Idade: " + idade.get(i));
				bw.newLine();
				bw.write("Cidade: " + cidade.get(i));
				bw.newLine();
				bw.newLine();
			}
			
			for (i = 5; i < qtd.size(); i++) {
				numeros = qtd.get(i);
				numero.add(numeros);
			}
			qtd.clear();
			i=0;
			j=1;
			while ( i<numero.size() && j<numero.size()) {
				qtd.add(numero.get(i));
				i+=2;
				preco.add(numero.get(j));
				j+=2;
			}
			
			bw.write("Produtos: ");
			bw.newLine();
			bw.newLine();
			
			for (i = 0 ; i < produto.size(); i++) {
				bw.write("Nome: "+ produto.get(i).replace("P", " "));
				bw.newLine();
				bw.write("Qtd em estoque: "+ qtd.get(i));
				bw.newLine();
				bw.write("Preço: " + preco.get(i));
				bw.newLine();
				bw.newLine();
			}
			
	
			}catch(IOException e) {
           e.printStackTrace();
			}
		
	}

}
