package aula06.Ex1;

import aula05.Ex1.DateYMD;
import java.time.LocalDate;    


public class Aluno extends Pessoa {

	private int nMec; 
	private static int lastMec = 100; // static para partilhar a variavel com todos os objetos
	private DateYMD inscDate;

	public Aluno(String name, int cc, DateYMD dataNasc, DateYMD inscDate) {
		super(name, cc, dataNasc);
		this.nMec = getNextMec();
		this.inscDate = inscDate;
	}

	public Aluno(String name, int cc, DateYMD dataNasc) { // aqui a data de inscrição fica a atual
		super(name, cc, dataNasc);
		this.nMec = getNextMec();
		//+: colocar a data atual na classe DateYMD
		LocalDate date = LocalDate.now();
		this.inscDate = new DateYMD(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
	}

	private int getNextMec(){
		return lastMec++;
	}

	int getNMec(){
		return this.nMec;
	}

	public String getName() {
		return super.getName();
	}
	
	@Override
	public String toString(){
		return "Aluno: " + super.getName() + " NMEC: " + this.nMec +" CC: " + super.getCC() + " Data de Nascimento: " + super.getDataNasc() + " Data de Inscrição: " + this.inscDate;
	}
}
