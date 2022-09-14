package Tratamentos_Ex11;

import java.util.Scanner;

public abstract class Tecnologias implements Interface_Tecnologia {

	
	Scanner sc = new Scanner (System.in);
	String descricaoLinguagem;
	
	private String linguagem;
	private String mainFramework;
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getMainFramework() {
		return mainFramework;
	}
	public void setMainFramework(String mainFramework) {
		this.mainFramework = mainFramework;
	}
	
	public Tecnologias() {}
	
	public Tecnologias(String linguagem, String mainFramework) {
		this.linguagem = linguagem;
		this.mainFramework = mainFramework;
	}
	
	public String  descLinguagem() {
		System.out.println("Descreva a sua linguagem: ");
		descricaoLinguagem = sc.next();
		return descricaoLinguagem;
	}
	public void descFrame(String descricaoFrame) {}
}
