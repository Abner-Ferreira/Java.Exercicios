package Exercicios_Repeticao;
import java.util.Scanner;

public class Ex21_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
	
		System.out.println("Digite um número positivo: ");
		num = ler.nextInt();
		
		while (num <= 0 ) {
			System.out.println("ERRO!, Digite somente valores positivos.");
			System.out.println("Digite um número positivo: ");
			num = ler.nextInt();
		}
		 System.out.println("Seu número é positivo!");

	}

}
