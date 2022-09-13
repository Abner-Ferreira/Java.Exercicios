package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex29_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int  num1, num2, soma, i; 
		
		num1 = 1;
		num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		for (i = 1 ; i<30 ; i++) {
			soma = num1 + num2 ; 
			num1 = num2 ; 
			num2 = soma;
			System.out.println(soma);
			
		}
	}

}
 