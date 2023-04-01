package aula06.Ex1;

import aula05.Ex1.DateYMD;

public class Professor extends Pessoa {

	private final String[] categorias = {"Auxiliar", "Associado", "Catedrático"};
	private String categoria;
	private String departamento;

	public Professor(String name, int cc, DateYMD dataNasc, String categoria, String departamento) {
		super(name, cc, dataNasc);
		this.categoria = categoria;
		this.departamento = departamento;
	}

	public String getProfessor() {
		return super.getName();
	}


	

	
}
