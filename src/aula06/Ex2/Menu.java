package aula06.Ex2;

import java.util.Scanner;
import aula05.Ex1.DateYMD;
import aula06.Ex1.Pessoa;

public class Menu {


	private static Contacts[] contactsArray;

	public static void main(String[] args) {

		int option = 0;
		//int currentDateIndex;
		Scanner sc = new Scanner(System.in);
		String nameOrNum;
		Contacts currentContact;
		do{
			showMenu();
			option = sc.nextInt();
			switch(option){
				case 1:
					//!: esta a dar erro aqui porque o nextLine() nao esta a ler o enter
					System.out.println("Nome da pessoa:");
					String nome = sc.nextLine();
					System.out.println("Cc:");
					int cc = sc.nextInt();
					System.out.print("Insira a data de nascimento (formado: dd-mm-yyyy): ");
                    String date = sc.nextLine();
                    String[] dateParts = date.split("-");
                    DateYMD birthDate = new DateYMD(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]));
					Pessoa pessoa = new Pessoa(nome, cc, birthDate);
					if (!verifyPerson(pessoa)){break;}
					System.out.println("Numero de telemovel:");
					int numero = sc.nextInt();
					System.out.println("Email:");
					String mail = sc.nextLine();
					Contacts contact = new Contacts(pessoa , numero, mail);
					addContact(contact);
					break;
				case 2:
					System.out.println("Nome ou numero da pessoa:");
					nameOrNum = sc.nextLine();
					currentContact = findNameOrNum(nameOrNum);
					secondMenu(currentContact);
					break;
				case 3:
					System.out.println("Nome ou numero da pessoa:");
					nameOrNum = sc.nextLine();
					currentContact = findNameOrNum(nameOrNum);
					//+: para apagar um objeto, primeiro = null e depois tirá-lo do array, eventualmente o garbage collector vai limpar
					Contacts[] newContactsArray = new Contacts[contactsArray.length];
					//+: uso um while para n deixar espaço vazio no array
					int i = 0;
					int j = 0; //contador para o novo array
					while( i < contactsArray.length){
						if (contactsArray[i] != currentContact){
							newContactsArray[j] = contactsArray[i];
							j++;
						}
						i++;
					}
					contactsArray = newContactsArray;
					currentContact = null;
					break;
				case 4:
					System.out.println("Nome ou numero da pessoa:");
					nameOrNum = sc.nextLine();
					currentContact = findNameOrNum(nameOrNum);
					System.out.printf("Numero de telemovel: %d\n" , currentContact.getNumero());
					break;
				case 0:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
		}while (option != 0);
		sc.close();
	}

	//+: identificar apartir de um nome ou numero o contacto da lista de contactos
	private static Contacts findNameOrNum(String nameOrNum){
		Scanner sc = new Scanner(System.in);
		Contacts[] arrayOfCorr = null;
		for (int i = 0; i < contactsArray.length; i++){
			if (contactsArray[i].getPerson().getName().equals(nameOrNum) || contactsArray[i].getPerson().getCC() == Integer.parseInt(nameOrNum)){
				if (arrayOfCorr == null){
					arrayOfCorr = new Contacts[1];
					arrayOfCorr[0] = contactsArray[i];
				}else{
					Contacts[] temp = new Contacts[arrayOfCorr.length + 1];
					for (int j = 0; j < arrayOfCorr.length; j++){
						temp[j] = arrayOfCorr[j];
					}
					temp[temp.length - 1] = contactsArray[i];
					arrayOfCorr = temp;
				}
			}
		}
		Contacts currentContact = null; //?: iniciei já para o caso de querer usar fora do if
		if (arrayOfCorr == null){
			System.out.println("Nao existe nenhum contacto com esse nome ou numero");
			currentContact = null; //!: li que dar return null é uma má pratica
		}else if (arrayOfCorr.length > 1){
			System.out.println("Existem varios contactos com esse nome ou numero, insira o ID:");
			int id = sc.nextInt();
				for (int i = 0; i < arrayOfCorr.length; i++){
					if (arrayOfCorr[i].getId() == id){
						currentContact = arrayOfCorr[i];
					}
				}
		}else{
			currentContact = arrayOfCorr[0];
			
		}
		sc.close();
		return currentContact;
	}

	
	private static void showMenu(){
		System.out.println("Alterações:");
		System.out.printf("1 -  Inserir contacto\n2 - Alterar contacto\n3 - Apagar contacto\n4 - Procurar contacto\n5 - Listar contactos\n0 - Exit\n");
	}

	//!: metodo inacabado, ainda dependente que acabe a seleção da pessoa
	private static void secondMenu(Contacts contact){
		Pessoa person = contact.getPerson();
		int option = 0;
		Scanner sc = new Scanner(System.in);
		do{
			showSecMenu();
			option = sc.nextInt();
			switch(option){
				case 1:
					//!: não tenho a certeza se isto funciona, alterar uma caracteristica de um objeto dentro de outro objeto, supostamente não muda a sua identidade por isso deve funcionar
					System.out.println("Nome da pessoa:");
					String name = sc.nextLine();
					person.setName(name);
					break;
				case 2:
					System.out.println("Cc da pessoa:");
					int cc = sc.nextInt();
					person.setCC(cc);
					break;
				case 3:
					System.out.println("Data de nascimento (formado: dd-mm-yyyy):");
					String date = sc.nextLine();
                    String[] dateParts = date.split("-");
                    DateYMD birthDate = new DateYMD(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]));
					person.setbithDate(birthDate);
					break;
				case 4:
					System.out.println("Numero de telemovel:");
					int numero = sc.nextInt();
					contact.setNumero(numero);
					break;
				case 5:
					System.out.println("Email da pessoa:");
					String email = sc.nextLine();
					contact.setEmail(email);
					break;
				default:
					System.out.println("Invalid option");
				break;
			}
		}while (option != 0);
		sc.close();
	}

	private static void showSecMenu(){
		System.out.println("Operações:");
		System.out.printf("1 -  Alterar nome\n2 - Alterar cc\n3 - Alterar data de nascimento\n4 - Alterar numero de telemovel\n5 - Alterar email\n0 - Exit\n");
	}

	private static boolean verifyPerson(Pessoa newperson){
		for (int i = 0; i < contactsArray.length; i++){
			if (contactsArray[i].getPerson().equals(newperson)){
				Scanner sc = new Scanner(System.in);
				System.out.println("Pessoa ja existe, pretende prosseguir?");
				Boolean answer = sc.nextBoolean();
				sc.close();
				return answer;
			}
		}
		return false;

	}	

	//+: fazer um array dinamico de uma classe (deste caso Contacts)
	private static void addContact(Contacts contact){
		//Contacts contact = new Contacts(nome, numero, mail);
		if (contactsArray == null){
			contactsArray = new Contacts[1];
			contactsArray[0] = contact;
		}else{
			Contacts[] newArray = new Contacts[contactsArray.length + 1];
			for (int i = 0; i < contactsArray.length; i++){
				newArray[i] = contactsArray[i];
			}
			newArray[contactsArray.length] = contact;
			contactsArray = newArray;
		}
	}
}
