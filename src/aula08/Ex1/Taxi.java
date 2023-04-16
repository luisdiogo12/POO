package aula08.Ex1;

public class Taxi extends AutomovelLigeiro{
	private int numLicenca;

	public Taxi(int numLicenca) {
		this.numLicenca = numLicenca;
	}

	public int getNumLicenca() {
		return numLicenca;
	}

	public void setNumLicenca(int numLicenca) {
		this.numLicenca = numLicenca;
	}

	@Override
	public String toString() {
		return "Taxi [numLicenca=" + numLicenca + "]";
	}
	
	
}
