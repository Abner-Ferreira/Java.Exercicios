package Arquivos_Ex17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		
		ArrayList <String> nomes = new ArrayList<>();
		ArrayList <Double> nota = new ArrayList<>();
		ArrayList <String> cidade = new ArrayList<>();
		
		String path = "C:\\temp\\Vestibular.txt";
		
		int i =0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			
			
			while (line !=null) {
				nomes.add(line);
				line = br.readLine();
			}
			String listaNome[] = nomes.toString().split(",");
			nomes.clear();
			while (i <= 14) {
				if (i%3 ==0 || i == 0 && i!=1 ) {
					nomes.add(listaNome[i]);
				}else if (i==7 || i==1 || i==4 || i ==10 || i==13) {
					Double notas = (Double.parseDouble(listaNome[i]));
					nota.add(notas);
				}else {
					cidade.add(listaNome[i]);
				}
				i++;
			}
			
			for (i = 0 ; i < nomes.size(); i++) {
				if(nota.get(i) >= 7) {		
					System.out.println("Nome: " + nomes.get(i));
					System.out.println("Nota: " + nota.get(i));
					System.out.println("Cidade: " + cidade.get(i));
					System.out.println("");
				}
			}
			
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
