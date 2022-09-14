package POO_Ex09;

public class Retangulo extends Quadrilatero implements FormaGeometrica{
	private double base;
	private double altura;

	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public Retangulo() {
		
	}
	
	public Retangulo(double base, double altura, double lado1, double lado2, double lado3, double lado4) {
		super(lado1,lado2,lado3,lado4);
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return (base*2)+(altura*2);
	}


	
}
