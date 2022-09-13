package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex23_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo;
		
//		System.out.printf("Qual é seu sexo (M ou F) ? ");
//		sexo = ler.nextLine();
//		sexo = sexo.toUpperCase();
		
		do {
			System.out.printf("Qual é seu sexo (M ou F) ? ");
			sexo = ler.nextLine();
			sexo = sexo.toUpperCase();
			if (sexo.equals("M")) {
				System.out.println("Você é do sexo masculino!");
			} else if (sexo.equals("F")){
				System.out.println("Você é do sexo feminino!");	
			} else {
				System.out.println("ERRO, escolha somente M ou F");
			}
		} while (sexo.equals("M") || sexo.equals("F") || sexo != "M" || sexo != "F");
		

	}

}
