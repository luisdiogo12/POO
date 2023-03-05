package aula3;

//Escreva um programa que lê do teclado uma data no formato mm/yyyy (validando os valores) 
//e o dia da semana em que começa esse mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 
//5 = Sexta, 6 = Sábado, 7 = Domingo). O programa deve depois apresentar no monitor o 
//calendário desse mês com o formato que a seguir se apresenta. 
//Implemente a funcionalidade pretendida com três funções: leitura de valores, com validação, 
//cálculo de dias no mês, considerando os anos bissextos, e impressão de resultados

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex5 {

	public static void main(String[] args) {
		
		String mmyy = getMonthYear();
		String[] mmyyArray = mmyy.split("/");
		int[] date = new int[3];
		for (int i = 1; i <= 2; i++)
		{
  			date[i] = Integer.parseInt(mmyyArray[i-1]); //para ficar ordenado por grandeza
		}
		System.out.println("Introduz o dia da semana: ");
		Scanner scc = new Scanner(System.in);
        while (true) {
            String input = scc.next();
            int week = 0;
            try {
                week = Integer.parseInt(input);
                if (week >= 1 && week <= 7) {
					date[0] = week;
                    break;
                } else {
                    System.out.println("Entre 1 e 7");
                } 
            } catch (NumberFormatException ne) {
                System.out.println("Não é inteiro");
            }
        }
		scc.close();
		drawCalendar(date);

	}

	public static String getMonthYear(){
		String mmyy;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Data no formato mm/yy:");
			mmyy = sc.nextLine();
		} while(isValidFormat(mmyy) == false);
		sc.close();
		return mmyy;
	}

	public static boolean isValidFormat(String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
    }

	public static void drawCalendar(int[] date) {

		date[2] = date[2] + 2000;

        if (date[0] == 7) date[0]  = 0;
		final String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };

		int days = numberOfDaysInMonth(date[1] , date[2]);
		String monthName = months[date[1]-1];

		int monthNameLength = monthName.length();
		int yearLength = String.valueOf(date[2]).length();
		int padding = (20 - monthNameLength - yearLength) / 2;
		String paddingString = "";
		for (int i = 0; i < padding; i++) paddingString += " ";
		
		System.out.println(paddingString + monthName + " " + date[2] + paddingString);
		System.out.println("Su Mo Tu We Th Fr Sa");

		for (int i = 0; i < date[0]; i++) System.out.print("   ");

		for (int i = 1; i <= days; i++) {
			System.out.printf("%2d ", i);
			if ((i + date[0]) % 7 == 0 || i == days) System.out.println();
		}
    }

	    public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    
}
