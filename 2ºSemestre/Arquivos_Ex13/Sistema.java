package Arquivos_Ex13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sistema {
	
	public static void main(String[] args) throws IOException {
	
		ArrayList  <String> nomes = new ArrayList<>();
		ArrayList  <Double> valores= new ArrayList<>();
		ArrayList <Double> total = new ArrayList<>();
		
		String path = "C:\\temp\\Lista.txt";
		String newPath = "C:\\temp\\Total.txt";
		
		double valorAux;
		double valor;
		String nome;
		int i = 0;
		int j = 0;
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
			String line = br.readLine();
			
			while (line != null) {
				nomes.add(line);
				line = br.readLine();
			}
		
			String listaNome[] = nomes.toString().split(",");
			nomes.clear();
		
			while (i < 30) {
				if (i == 0 || i%3 == 0 && i!=1) {
					nome = listaNome[i];
					nomes.add(nome);

					
				}else {
					valor = (Float.parseFloat(listaNome[i]));
					valores.add(valor);
				}
				i++;
	           
			}
			
			while(j < 19) {
				valorAux = valores.get(j);
				j++;
				valorAux *= valores.get(j);
				total.add(valorAux);
				j++;
			}
			
		
			
			for (int contador = 0; contador < 10; contador++) {
				bw.write(nomes.get(contador)+ ",");
				bw.write(Double.toString(total.get(contador)));
				bw.newLine();
			}
			
			}catch(IOException e) {
           e.printStackTrace();
			}
		
	}

}
