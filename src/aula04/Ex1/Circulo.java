package aula04.Ex1;

public class Circulo {
	private double raio;
	
	private void defineCircle(double raio) {
		if (raio <= 0){
			throw new IllegalArgumentException("Raio deve ser maior que 0");
		} else {
			this.raio = raio;
		}
	}

	public Circulo(double raio) {
		defineCircle(raio);
	}
	
	public void setRaio(double raio) {
		defineCircle(raio);
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
