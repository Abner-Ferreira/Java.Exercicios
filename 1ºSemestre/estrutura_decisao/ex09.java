package estrutura_decisao;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num1, num2;
		System.out.println("Digite o primeiro valor: ");
		num1 = ler.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2 = ler.nextDouble();
		if (num1 < num2) {
			System.out.println("O primeiro número é menor que o segundo");
		}else {
			System.out.println("O segundo número é menor que o primeiro");
		}
		
	}

}
