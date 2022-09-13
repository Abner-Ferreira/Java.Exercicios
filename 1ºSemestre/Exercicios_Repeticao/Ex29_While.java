package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex29_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, aux,soma;
		
		num1 =1 ;
		num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		aux = 1 ; 
		
		while (aux < 30) {
			soma = num1 + num2 ;
			num1 = num2;
			num2 = soma ;
			aux ++;
			System.out.println(soma);
		}
		
		
		
		
		
		ler.close();
	}

}
