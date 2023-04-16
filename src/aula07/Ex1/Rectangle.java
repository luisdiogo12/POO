package aula07.Ex1;

public class Rectangle extends Shape{
	private double lenght, width;

	public Rectangle(double lenght, double width, String color) {
		if (lenght <= 0 || width <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.lenght = lenght;
			this.width = width;	
			this.color = color;
		}
	}
	
	public void setComp(double lenght) {
		if (lenght <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.lenght = lenght;	
		}
	}

	public void setLag(double width) {
		if (lenght <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.width = width;	
		}
	}

	public double getComp() {
		return this.lenght;
	}

	public double getLag() {
		return this.width;
	}
	
	public double getArea() {
		return this.lenght * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.lenght + this.width);
	}

	public boolean equals(Shape  c) {  //+: sobrescreve o método equals da classe Object 
		if (c instanceof Rectangle) {
			Rectangle c1 = (Rectangle) c;
			return (this.lenght == c1.lenght && this.width == c1.width && this.color == c1.color);
		} else {
			return false;
		}
	}

	public String toString() {
		return "Retangulo [comp=" + lenght + ", lag=" + width + "]";
	}

}
