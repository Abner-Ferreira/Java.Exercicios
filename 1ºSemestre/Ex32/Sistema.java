package Ex32;
import java.util.Scanner;
public class Sistema{

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Cliente[] listaCliente = new Cliente[5] ; 
		
		for (int i = 0; i<5; i++) {
			Cliente a = new Cliente() ;
			System.out.printf("Digite seu id: ");
			a.id = ler.nextInt();
			System.out.printf("Digite seu nome: ");
			a.nome = ler.next();
			System.out.printf("Digite sua idade: ");
			a.idade = ler.nextInt();
			System.out.printf("Digite seu email: ");
			a.email = ler.next();
			listaCliente[i] = a ;
		}
		for (int i = 0 ; i<5; i++) {
			
			if(listaCliente[i].idade > 18) {
				System.out.printf("O cliente %s tem mais de 18 anos. \n",listaCliente[i].nome);
			}
		}
		
		
	}

}
