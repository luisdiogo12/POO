package aula06.Ex1;

import aula05.Ex1.DateYMD /*as Date*/;

public class Pessoa {

	private String name;
	private int cc;
	private DateYMD dataNasc;

	public Pessoa(String name, int cc, DateYMD dataNasc){
		// garantir que os valores são validos
		this.name = name;  
		this.cc = cc;
		this.dataNasc = dataNasc;
	}

	public String getName() {
		return this.name;
	}
	
	public int getCC() {
		return this.cc;
	}

	public String getDataNasc() {
		return this.dataNasc.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCC(int cc2) {
		this.cc = cc2;
	}

	public void setbithDate(DateYMD birthDate) {
		this.dataNasc = birthDate;
	}

}
