package aula06.Ex1;

import aula05.Ex1.DateYMD;

public class Bolseiro extends Aluno {

	private Professor Orientador;
	private double bolsaMensal;

	public Bolseiro(String name, int cc, DateYMD dataNasc, Professor Orientador, double bolsaMensal) {
		super(name, cc, dataNasc); // queria que ele aqui fosse ao Aluno (para ser atribuido o nMec) e do aluno é que fosse a Pessoa
		this.Orientador = Orientador;
		this.bolsaMensal = bolsaMensal;
	}

	public void setBolsa(double i) {
		this.bolsaMensal = i;
	}
	
	public void setOrientador(Professor p) {
		this.Orientador = p;
	}

	public double getBolsa() {
		return this.bolsaMensal;
	}

	public String getOrientador() {
		return this.Orientador.getName();
	}
	
	
}
