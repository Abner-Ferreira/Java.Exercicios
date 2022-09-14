package Tratamentos_Ex11;

public class FrontEnd extends Tecnologias implements Interface_Tecnologia{

	private String nome;
	private String framework;
	private String web;
	private String mobile;
	
	
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	@Override
	public void descLinguagem(String descricaoLinguagem) {
	}
	public void descFrame(String descricaoFramework) {
	}

	
}
