package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex21_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
		
		do {
			System.out.printf("Digite um valor positivo: ");
			num = ler.nextInt();
		} 
		while (num >= 0 );
		System.out.println("Número negativo!");

	}

}
