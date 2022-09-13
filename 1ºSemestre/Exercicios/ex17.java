package Exercicios;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso,altura, imc;
		String sexo;
		
		System.out.println("Você é homem ou mulher: ");
		sexo =  ler.nextLine();
		sexo = sexo.toLowerCase();
		System.out.println("Digite seu peso (kg): ");
		peso = ler.nextDouble();
		System.out.println("Digite sua altura (metros): ");
		altura = ler.nextDouble();
		imc = peso / (altura*altura);
		
		if (sexo.equals("mulher")){
			if(imc<19) {
				System.out.println("Você é mulher e está ABAIXO do peso ideal!!");
				
			}else if (imc >= 19 && imc < 24) {
				System.out.println("Você é mulher e está no peso ideal!!");
			}else {
				System.out.println("Você é mulher e está ACIMA do peso!!");
			}
			
		}else {
			if (imc < 20) {
				System.out.println("Você é homem e está ABAIXO do peso!!");
			}else if (imc >= 20 && imc < 25) {
				System.out.println("Você é homem e está no peso ideal!!");
			}else {
				System.out.println("Você é homem e está ACIMA do peso!!");
			}

		}

	}

}
