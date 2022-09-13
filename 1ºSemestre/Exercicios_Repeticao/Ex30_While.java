package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex30_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1, num2,num3 , aux,soma;
		
		num1 =1 ;
		num2 = 1;
		num3 = 1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		aux = 1 ; 
		
		while (aux < 18) {
			soma = num1 + num2 + num3;
			num1 = num2;
			num2 = num3 ;
			num3 = soma;
			aux ++;
			System.out.println(soma);
		}

		
		
		
		
		ler.close();
	}

}
