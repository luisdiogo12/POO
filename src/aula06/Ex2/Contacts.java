package aula06.Ex2;

import aula06.Ex1.* ;
import java.util.*;

public class Contacts {

	private Pessoa person;
	private int id; //numero sequencial começado em 1
	private static int lastId = 1;
	private int numTel;
	private static int[] numTels;
	private String email;
	private static String[] emails;

	//public Contacts(){}

	public Contacts(Pessoa person, int numTel, String email) {
		this.person = person;
		this.id = getNextID();
		if (validNumTel(numTel)){
			this.numTel = numTel;
			insertNumTel(numTels, numTel);
		}else{
			System.out.println("Numero de telefone invalido");
		}

		if (validEmail(email)){
			this.email = email;
			insertEmail(emails, email);
		}else{
			System.out.println("Email invalido");
		}
	}

	//!: n tenho a certeza se resuta, mas criaria aqui um objeto nulo para dar a volta a n dar para dar return null


	private int getNextID(){
		return lastId++;
	}	
	
	//!: ver se este codigo funciona bem com o array visto este n estar iniciado
	private int[] insertNumTel(int[] numTels , int numTel){
		int[] newNumTels = new int[numTels.length + 1];
		for (int i = 0; i < numTels.length; i++){
			newNumTels[i] = numTels[i];
		}
		newNumTels[newNumTels.length - 1] = numTel;
		Arrays.sort(newNumTels);
		return newNumTels;
	}

	//!: ver se este codigo funciona bem com o array visto este n estar iniciado
	private String[] insertEmail(String[] emails , String email){
		String[] newEmails = new String[emails.length + 1];
		for (int i = 0; i < emails.length; i++){
			newEmails[i] = emails[i];
		}
		newEmails[newEmails.length - 1] = email;
		Arrays.sort(newEmails);
		return newEmails;
	}


	private boolean validNumTel(int numTel){
		//+:binary search para ver se o numero esta na lista, Arrays.binarySearch retorna o indice do elemento se estiver na lista, se nao estiver retorna -1
		if( Arrays.binarySearch(numTels, numTel) >= 0 && cf(numTel)[0] == 9 && cf(numTel)[1] == 9 ){
			return true;
		}
		return false;
	}

	//+:função para ir buscar o algarismo mais à esquerda do numero e fazer a contagem de algarismos
	public int[] cf(int n){  
		int count = 0;  
		int firstDig = n;
		while(n != 0){  
			n = n / 10;  
			count = count + 1; 
			firstDig = n;
		}
		int[] cf = {count, firstDig};
		return cf;  
	}  

	private boolean validEmail(String email){
		//+:binarysearch para pesquisar o email entre a lista de email(funciona com strings), str.indexOf para ver se os characteres estão presentes e por ordem
		if (Arrays.binarySearch(emails, email) >= 0 && email.indexOf("@") != -1 && (email.indexOf(".") > email.indexOf("@"))){
			return true;
		}
		return false;
	}

	public Pessoa getPerson(){
		return this.person;
	}

	public int getId(){
		return this.id;
	}

	public Object getNumero() {
		return this.numTel;
	}

	public void setNumero(int numTel) {
		if (validNumTel(numTel)){
			this.numTel = numTel;
			insertNumTel(numTels, numTel);
		}else{
			System.out.println("Numero de telefone invalido");
		}
	}

	public void setEmail(String email) {
		if (validEmail(email)){
			this.email = email;
			insertEmail(emails, email);
		}else{
			System.out.println("Email invalido");
		}
	}

	public String getEmail() {
		return this.email;
	}


}
