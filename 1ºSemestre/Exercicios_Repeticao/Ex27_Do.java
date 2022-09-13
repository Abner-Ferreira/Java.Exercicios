package Exercicios_Repeticao;
import java.util.Scanner;

public class Ex27_Do {

	public static void main(String[] args)  {
		Scanner ler = new Scanner (System.in);
		int tab,num,i;
		
		num = 0;
		do {
			i= 1;
			num ++;
			
			do {
				tab = num * i; 
				System.out.printf("%d x %d = %d \n",num,i,tab);
				i ++;
			} while (i <= 10);
			System.out.println("Aperte uma tecla \n");
			ler.nextLine();
		}while (num <=19 );
		
		ler.close();
		
	}

}

