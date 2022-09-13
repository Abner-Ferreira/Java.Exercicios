package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex28_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma,i ; 
		soma = 0;
		i = 0 ; 
		do {
			i += 1; 
			soma += i ;
			System.out.println(soma);
		}while(i <=99);
	}

}
