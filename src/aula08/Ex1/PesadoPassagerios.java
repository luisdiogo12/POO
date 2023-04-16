package aula08.Ex1;

public class PesadoPassagerios extends Veiculo implements KmPercorridosInterface{

	private String numQuadro;
	private double numPassageiros;
	private double numMaxPassageiros;
	@Override
	public void trajeto(int quilometros) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'trajeto'");
	}
	@Override
	public int ultimoTrajeto() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'ultimoTrajeto'");
	}
	@Override
	public int distanciaTotal() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'distanciaTotal'");
	}
	public String getMatricula() {
		return super.matricula;
	}
	public String getMarca() {
		return super.marca;
	}
	public String getModelo() {
		return super.modelo;
	}
	public double getPotencia() {
		return super.potencia;
	}
	public String getNumQuadro() {
		return numQuadro;
	}
	public double getNumPassageiros() {
		return numPassageiros;
	}
	public double getNumMaxPassageiros() {
		return numMaxPassageiros;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public void setNumQuadro(String numQuadro) {
		this.numQuadro = numQuadro;
	}
	public void setNumPassageiros(double numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public void setNumMaxPassageiros(double numMaxPassageiros) {
		this.numMaxPassageiros = numMaxPassageiros;
	}
	
}
