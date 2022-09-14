package POO_Ex09;

public class Circulo implements FormaGeometrica{
	private double raio;
	private double diametro;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getDiametro() {
		return raio*2;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public Circulo() {
		
	}
	public Circulo(double raio, double diametro) {
		this.raio=raio;
		this.diametro=diametro;
	}

	public double calcularArea() {
		return (raio*raio)*3.14;
	}
	
	public double calcularPerimetro() {
		return 2*3.14*raio;
	}


}
