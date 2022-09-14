package POO_Ex09;

public class Quadrado extends Quadrilatero implements FormaGeometrica{
	private double lado;

	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado(){
		
	}
	public Quadrado (double lado1, double lado2, double lado3, double lado4, double lado) {
		super(lado1, lado2,lado3,lado4);
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}


}
