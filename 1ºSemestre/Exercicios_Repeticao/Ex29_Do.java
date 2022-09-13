package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex29_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1, num2, soma, aux;
		
		num1 = 1;
		num2 = 1;
		aux= 1;
		System.out.println(num1);
		System.out.println(num2);
		do {
			soma = num1 + num2 ;
			num1 = num2;
			num2 = soma;
			aux ++ ;
			System.out.println(soma);
		}while(aux <30);
		

		ler.close();
	}
}
