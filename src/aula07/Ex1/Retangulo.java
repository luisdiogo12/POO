package aula07.Ex1;

public class Retangulo extends Forma{
	private double comp, lag;

	public Retangulo(double comp, double lag) {
		if (comp <= 0 || lag <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.comp = comp;
			this.lag = lag;	
		}
	}
	
	public void setComp(double comp) {
		if (comp <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.comp = comp;	
		}
	}

	public void setLag(double lag) {
		if (comp <= 0){
			throw new IllegalArgumentException("Comprimento e largura deve ser maior que 0");
		} else {
			this.lag = lag;	
		}
	}

	public double getComp() {
		return this.comp;
	}

	public double getLag() {
		return this.lag;
	}
	
	public double area() {
		return this.comp * this.lag;
	}

	public double perimetro() {
		return 2 * (this.comp + this.lag);
	}

	public boolean equals(Retangulo r) {
		return (this.comp == r.comp && this.lag == r.lag);
	}

	public String toString() {
		return "Retangulo [comp=" + comp + ", lag=" + lag + "]";
	}
	
}
