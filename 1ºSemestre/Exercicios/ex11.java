package Exercicios;
	import java.util.Scanner ;
public class ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double base, altura, area;
		System.out.printf("Digite o valor da base de seu terreno: ");
		base = ler.nextDouble();
		System.out.printf("Digite o valor da altura de seu terreno: ");
		altura = ler.nextDouble();
		area = base * altura;
		if(area>100) {
			System.out.printf("TERRENO GRANDE");
		} 
		
	}

}
