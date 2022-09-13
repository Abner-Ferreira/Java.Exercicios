	package Exercicios;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double base,alt,area;
		System.out.printf("Digite o valor da base do triângulo: ");
		base = ler.nextDouble();
		System.out.printf("Digite o valor da altura do triângulo: ");
		alt = ler.nextDouble();
		area = base * alt / 2 ; 
		System.out.printf("A área de seu triângulo é %.2f", area);

	}

}
