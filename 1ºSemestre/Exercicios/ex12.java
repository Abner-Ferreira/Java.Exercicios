package Exercicios;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double base, altura, area;
		System.out.printf("Digite a base de seu terreno: ");
		base = ler.nextDouble();
		System.out.printf("Digite a altura de seu terreno: ");
		altura = ler.nextDouble();
		area = base * altura;
		if (area > 100) {
			System.out.println("TERRENO GRANDE");
		} else {
			System.out.println("TERRENO PEQUENO");
		}

	}

}
