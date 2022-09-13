package Exercicios;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double num1, num2 ;
	System.out.println("Digite o primeiro valor: ");
	num1 = ler.nextDouble();
	System.out.println("Digite o segundo valor:");
	num2 = ler.nextDouble();
	if (num1 > num2) {
		System.out.printf("O valor %.1f é maior que o outro valor.", num1);
	} else if (num1 == num2){
		System.out.printf("Os valores %.1f e %.1f são identicos", num1,num2);
	} else {
		System.out.printf("O valor %.1f é maior que o outro valor.", num2);
	}
	}

}
