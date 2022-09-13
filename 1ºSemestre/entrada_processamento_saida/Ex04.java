package entrada_processamento_saida;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double a,b,area;
		System.out.printf("Informe o valor da base do retângulo:");
		a = ler.nextDouble();
		System.out.printf("Informe o valor da altura do retângulo:");
		b = ler.nextDouble();
		area = a * b;
		System.out.printf("A área do retângulo de base %.2f e altura de %.2f é %.2f", a,b,area);

	}

}
