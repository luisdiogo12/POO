package aula04.Ex1;

public class Triangulo {
	private double[] lados = new double[3];

	private void defineTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 <= 0 && lado2 <= 0 && lado3 <= 0){
			throw new IllegalArgumentException("Os lados devem ser maior que 0");
		} else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			throw new IllegalArgumentException("Não satisfaz a desigualdade triangular");
		} else {
			this.lados[0] = lado1;
			this.lados[1] = lado2;
			this.lados[2] = lado3;
		}
	}

	public Triangulo(double lado1 , double lado2, double lado3) {
		defineTriangulo(lado1, lado2, lado3);;
	}
	
	public void setLados(double lado1 , double lado2, double lado3) {
		defineTriangulo(lado1, lado2, lado3);;
	}

	public double getLados(int i) {
		return lados[i];
	}
	
	public double area() {
		double p = ( this.lados[0] + this.lados[1] + this.lados[2]) / 2;
		return Math.sqrt(p * (p - this.lados[0]) * (p - this.lados[1]) * (p - this.lados[2]));
	}

	public double perimetro() {
		return this.lados[0] + this.lados[1] + this.lados[2];
	}

	public boolean equals(Triangulo t) {
		for (int i = 0; i < 3; i++) {
			if (this.lados[i] != t.getLados(i)) {
				return false; //basta que um lado seja diferente, comparar para dar true é mais complicado
			}
		}
		return true;
	}

	public String toString() {
		return "Triangulo [lados=" + lados[0] + ", " + lados[1] + ", " + lados[2] + "]";
	}

}
