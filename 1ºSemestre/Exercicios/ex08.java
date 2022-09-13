package Exercicios;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num1, num2;
		System.out.println("Digite o primeiro valor: ");
		num1 = ler.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2 = ler.nextDouble();
		if (num1 > num2) {
			System.out.printf("O primeiro valor é maior que o segundo");
		} else {
			System.out.printf("O segundo valor é maior que o primeiro");
		}
	}

}
