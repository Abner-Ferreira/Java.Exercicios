package Exercicios;
 import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, media ;
		System.out.printf("Digite o valor do primeiro número: ");
		n1 = ler.nextDouble();
		System.out.printf("Digite o valor do segundo número: ");
		n2 = ler.nextDouble();
		System.out.printf("Digite o valor do terceiro número: ");
		n3 = ler.nextDouble();
		System.out.printf("Digite o valor do quarto número: ");
		n4 = ler.nextDouble();
		media = (n1 + n2 + n3 + n4)/ 4 ; 
		System.out.printf("A média aritimética desses números é %.2f.", media);

	}

}