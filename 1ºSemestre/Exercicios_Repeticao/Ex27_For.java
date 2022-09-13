package Exercicios_Repeticao;

import java.util.Scanner;
public class Ex27_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, tab, num;
		
		
		for (num = 1; num <= 20; num++) {
			for (i = 1 ; i <= 10 ; i++) {
				if (num <= 20 && num >= 1) {
					tab = num * i ;
					System.out.printf("%d x %d = %d \n",num, i ,tab);
					continue;
				}
			}
			System.out.println("Aperte uma tecla \n");
			ler.nextLine();
		}
	}
}
