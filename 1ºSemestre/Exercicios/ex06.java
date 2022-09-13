package Exercicios;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double cotdol, dol, reais ;
		System.out.printf("Digite o valor da cotação do dolar atual: ");
		cotdol = ler.nextDouble();
		System.out.printf("Digite a quantidade de dolar que deseja converter para reais: ");
		dol = ler.nextDouble();
		reais = dol * cotdol ;
		System.out.printf("%.2f dolares é equivalente à %.2f reais.", dol, reais);

	}

}
