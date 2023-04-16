package aula07.Ex1;

public class Triangle extends	Shape{
	private double[]sides = new double[3];

	private void defineTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 <= 0 && lado2 <= 0 && lado3 <= 0){
			throw new IllegalArgumentException("Os sides devem ser maior que 0");
		} else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			throw new IllegalArgumentException("Não satisfaz a desigualdade triangular");
		} else {
			this.sides[0] = lado1;
			this.sides[1] = lado2;
			this.sides[2] = lado3;
		}
	}

	public Triangle(double lado1 , double lado2, double lado3) {
		defineTriangulo(lado1, lado2, lado3);;
	}
	
	public void setsides(double lado1 , double lado2, double lado3) {
		defineTriangulo(lado1, lado2, lado3);;
	}

	public double getsides(int i) {
		return sides[i];
	}
	
	public double getArea() {
		double p = ( this.sides[0] + this.sides[1] + this.sides[2]) / 2;
		return Math.sqrt(p * (p - this.sides[0]) * (p - this.sides[1]) * (p - this.sides[2]));
	}

	public double getPerimeter() {
		return this.sides[0] + this.sides[1] + this.sides[2];
	}

	public boolean equals(Shape  c) {  //+: sobrescreve o método equals da classe Object 
		if (c instanceof Triangle) {
			Triangle c1 = (Triangle) c;
			return (this.sides[0] == c1.sides[0] &&this.sides[1] == c1.sides[1] &&this.sides[2] == c1.sides[2] && this.color == c1.color);
		} else {
			return false;
		}
	}

	public String toString() {
		return "Triangulo [sides=" + sides[0] + ", " + sides[1] + ", " + sides[2] + "]";
	}

}
