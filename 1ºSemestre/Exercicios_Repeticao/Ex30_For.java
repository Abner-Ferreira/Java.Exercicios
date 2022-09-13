package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex30_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,num1,num2,num3,soma;
		
		num1 = 1;
		System.out.println(num1);
		num2 = 1;
		System.out.println(num2);
		num3 = 1 ; 
		System.out.println(num3);
		
		for (i=1 ; i<18; i++) {
			soma = num1 + num2 + num3;
			num1 = num2 ;
			num2 = num3 ;
			num3 = soma ;
			System.out.println(soma);
			ler.close();	
		}
	}

}
