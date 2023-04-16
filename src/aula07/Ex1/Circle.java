package aula07.Ex1;

public class Circle extends Shape{
	
	private double radius;  //?: caracteristica inerente à identidade circulo, portanto não dever ser apresentada na classe forma

	private void defineCircle(double radius, String color) {
		if (radius <= 0){
			throw new IllegalArgumentException("Raio deve ser maior que 0");
		} else {
			this.radius = radius;
		}
		this.color = color;
	}

	public Circle (double radius, String color) {
		defineCircle(radius , color);
		this.color = color;
	}
	
	public void setRadius(double radius, String color) {
		defineCircle(radius , color);
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean equals(Shape  c) {  //+: sobrescreve o método equals da classe Object 
		if (c instanceof Circle) {
			Circle c1 = (Circle) c;
			return (this.radius == c1.radius && this.color == c1.color);
		} else {
			return false;
		}
	}

	public String toString() {
		return "Circulo [raio=" + radius + "]";
	}


}
