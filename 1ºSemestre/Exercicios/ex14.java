package Exercicios;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso, altura, imc;
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		System.out.printf("Digite sua altura em metros: ");
		altura = ler.nextDouble();
		imc = peso / (altura*altura);
		System.out.printf("O seu imc é de %.2f", imc);

	}

}
