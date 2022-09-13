package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex21_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num ;
		
		for (int i = 0; i < 1; i++) {
		System.out.println("Digite um numero positivo: ");
		num = ler.nextInt();
			if (num <= 0) {
				System.out.println("ERRO!");
				i--;
			}
		}
	}

}
