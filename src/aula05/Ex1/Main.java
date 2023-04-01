package aula05.Ex1;

import java.util.*;

public class Main {

	private DateYMD[] dateArray;

	public int addDate(DateYMD date){
		if (dateArray == null){
			dateArray = new DateYMD[1];
			dateArray[0] = date;
		}else{
			DateYMD[] newArray = new DateYMD[dateArray.length + 1];
			for (int i = 0; i < dateArray.length; i++){
				newArray[i] = dateArray[i];
			}
			newArray[dateArray.length] = date;
			dateArray = newArray;
		}
		return dateArray.length - 1;
	}

	public static void main(String[] args){
		
		int option = 0;
		int currentDateIndex;
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		do{
			showMenu();
			option = sc.nextInt();
			switch(option){
				case 1:
					System.out.println("Insert month:");
					int month = sc.nextInt();
					System.out.println("Insert day:");
					int day = sc.nextInt();
					System.out.println("Insert year:");
					int year = sc.nextInt();
					currentDateIndex = main.addDate(new DateYMD(month, day, year));
					DateYMD currentDate = dateArray[currentDateIndex];//pq que n dá?
					break;
				case 2:
					System.out.println(currentDate.toString());
					break;
				case 3:
					currentDate.increment();
					break;
				case 4:
					currentDate.decrement();
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

	public static void showMenu(){
		System.out.println("Date operations:");
		System.out.printf("1 - create new date\n2 - show current date\n3 - increment date\n4 - decrement date\n0 - exit");
	}

	
}
