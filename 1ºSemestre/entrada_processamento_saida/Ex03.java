package entrada_processamento_saida;
import java.util.Scanner;
public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota;
		String nome;
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.printf("Digite sua nota da P1: ");
		nota = ler.nextDouble();
		System.out.printf("%s tirou %.2f na sua P1",nome,nota);

	}

}
