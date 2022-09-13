package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex28_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma, i ;
		
		soma = 0; 
		i = 1;		
		while (i <= 100) {
			soma += i;
			System.out.println(soma);
			i++;
		}

	}

}
