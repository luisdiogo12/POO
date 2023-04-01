package aula07.Ex1;

public class Circulo extends Forma{
	private double raio;
	
	private void defineCircle(double raio, String cor) {
		if (raio <= 0){
			throw new IllegalArgumentException("Raio deve ser maior que 0");
		} else {
			this.raio = raio;
		}
		this.cor = cor;
	}

	public Circulo(double raio, String cor) {
		defineCircle(raio , cor);
		this.cor = cor;
	}
	
	public void setRaio(double raio, String cor) {
		defineCircle(raio , cor);
	}

	public double getRaio() {
		return raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}

	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	public boolean equals(Circulo c) {
		return this.raio == c.raio;
	}

	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
