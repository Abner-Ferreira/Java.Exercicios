package Exercicios;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num1, num2, num3;
		System.out.printf("Digite o valor do primeiro número: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digte o valor do segundo número: ");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro número: ");
		num3 = ler.nextDouble();
		
		if (num1 + num2 > num3 || num2 + num3 > num1 || num3 + num1 > num2) {
			if (num1 != num2 && num1 != num3 && num2 !=num3) {
				System.out.println("Esse triângulo é escaleno.");
			}else if( (num1 == num2) &&
					  (num2 != num3) ||
					  (num1 == num3) &&
					  (num3 != num2) || 
					  (num2 == num3) &&
					  (num3 != num1) ){
				System.out.println("Esse triângulo é isósceles.");
			} else{
				System.out.println("Esse triângulo é equilátero.");
			}
		}else {
			System.out.printf("Com esses números não é possivel criar um triângulo.");
		}
	}

}
