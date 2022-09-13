package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex24_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int tab, i ;
		
		for (i = 1;  i <= 10 ; i++) {
			tab = 5 * i;
			
			System.out.printf("5 x %d = %d \n",i,tab);
		}

	}

}
