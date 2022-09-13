package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex28_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, soma ; 
		soma = 0;
		for (i = 1 ; i <= 100; i ++) {
			soma += i ;
			 
			System.out.println(soma);
		}

	}

}
