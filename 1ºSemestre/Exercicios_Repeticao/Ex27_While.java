package Exercicios_Repeticao;

import java.util.Scanner;
public class Ex27_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int tab , num , i ;
		
		i = 1;
		num = 1; 
		
		while (num <= 20) {
				
				
			for(i = 1 ; i <=10; i++){
				
				tab = num * i;
				System.out.printf("%d x %d = %d \n", num , i , tab);
					
			}
			num++;
			System.out.println("Aperte um tecla \n");
			ler.nextLine();
		}
		ler.close();
	}

}
