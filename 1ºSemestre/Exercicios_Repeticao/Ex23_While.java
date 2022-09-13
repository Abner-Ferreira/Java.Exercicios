package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex23_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String sexo;
		
		System.out.printf("Qual é o seu sexo (M ou F)?");
		sexo = ler.nextLine();
		sexo = sexo.toUpperCase();
		
		while (sexo.equals("M") || (sexo.equals("F")) || sexo != "M" || sexo != "F" ) {
			if (sexo.equals("M")) {
				System.out.println("Seu sexo é masculino!");
				break;
			} else if (sexo.equals("F")) {
				System.out.println("Seu sexo é feminino!");
				break;
			} else {
				System.out.println("ERRO, escolha somente M ou F!");
				break;
			}
			
		}
		
		
	}

}
