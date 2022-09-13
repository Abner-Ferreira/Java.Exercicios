package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1,num2;
		
		System.out.println("Digite o valor do primeiro número: ");
		num1 = ler.nextInt();
		do{
			System.out.printf("Digite o valor do segundo número: ");
			num2 = ler.nextInt();
			
		}
		while (num1>num2);
		System.out.println("O segundo número é maior que o primeiro!");
	}

}
