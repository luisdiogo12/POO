package aula07.Ex1;

public abstract class Shape {
	protected String color;  //comum a todas as figuras, considerando agora que são diferentes duas figuras que tenham cores diferentes
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
	public abstract boolean equals(Shape s);

	//?: se o metodo equals fosse igual para todas as classe podia por aqui como static???
}
