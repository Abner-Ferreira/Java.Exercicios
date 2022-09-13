package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex25_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, i,tab;
		System.out.println("Você quer saber a tábuada de qual número? ");
		num = ler.nextInt();
		for (i = 1; i <=10 && num > 0 ; i++) {
			tab = num * i ;
			System.out.printf("%d x %d = %d \n", num, i , tab);
		}
		

	}

}
