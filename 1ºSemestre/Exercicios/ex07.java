package Exercicios;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			double prod1,prod2, prod3,prod4,prod5,total, pag, troco;
			System.out.printf("Digite o valor do primeiro produto: ");
				prod1 = ler.nextDouble();
			System.out.printf("Digite o valor do segundo produto: ");
				prod2 = ler.nextDouble();
			System.out.printf("Digite o valor do terceiro produto: ");
				prod3 = ler.nextDouble();
			System.out.printf("Digite o valor do quarto produto: ");
				prod4 = ler.nextDouble();
			System.out.printf("Digite o valor do quinto produto: ");
				prod5 = ler.nextDouble();
				total = prod1+prod2+prod3+prod4+prod5;
			System.out.printf("No total deu %.2f reais, com quantos reais irá pagar? ",total);
				pag = ler.nextDouble();
				troco = pag - total ;
			System.out.printf("Seu troco será de %.2f reais.", troco);
	}

}
