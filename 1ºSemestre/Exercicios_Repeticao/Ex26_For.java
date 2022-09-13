package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex26_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, a ,b, tab, i ;
		
		System.out.println("Digite um número para saber a tábuada: ");
		num = ler.nextInt();
		System.out.println("Digite do intervalo de: ");
		b = ler.nextInt();
		System.out.println("Para o intervalo de: ");
		a = ler.nextInt();
		
		if (b > a ) {	
			for (i = b; i >= a ; i --) {
				tab = num * i;
				System.out.println(tab);
				

				
			}
		}	
		
		
	}

}
