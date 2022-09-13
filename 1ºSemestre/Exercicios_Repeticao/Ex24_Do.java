package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex24_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int tab;
		tab = 0;
		do {
			System.out.println("A tábuada do 5 é :");
			tab = 5 * 1; 
			System.out.printf("5 x 1 = %d \n", tab); 
			tab = 5 * 2;
			System.out.printf("5 x 2 = %d \n", tab); 
			tab = 5 * 3;
			System.out.printf("5 x 3 = %d \n", tab); 
			tab = 5 * 4;
			System.out.printf("5 x 4 = %d \n", tab); 
			tab = 5 * 5;
			System.out.printf("5 x 5 = %d \n", tab); 
			tab = 5 * 6;
			System.out.printf("5 x 6 = %d \n", tab); 
			tab = 5 * 7;
			System.out.printf("5 x 7 = %d \n", tab); 
			tab = 5 * 8;
			System.out.printf("5 x 8 = %d \n", tab); 
			tab = 5 * 9;
			System.out.printf("5 x 9 = %d \n", tab); 
			tab = 5 * 10;
			System.out.printf("5 x 10 = %d \n", tab); 
			break;
		}
		while (tab >= 0 && tab <= 50);
			

	}

}
