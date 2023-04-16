package aula07.Ex2; 

public class DateYMD {
    private int month;
    private int day;
    private int year;

    public DateYMD(int day, int month, int year) {
        if (!Date.validMonth(month)) throw new IllegalArgumentException("Mês inválido");
        if (!Date.valid(month, day, year)) throw new IllegalArgumentException("Dia inválido");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public  void set(int month, int day, int year) {
        if (!Date.validMonth(month)) throw new IllegalArgumentException("Mês inválido");
        if (!Date.valid(month, day, year)) throw new IllegalArgumentException("Dia inválido");
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public int getDay(){
    	return day;
    }

    public int getMonth(){
    	return month;
    }

    public int getYear(){
    	return year;
    }

    public DateYMD getDate(){
    	return this;
    }

    public void increment() {
        if (valid(month, day + 1, year)) {
            day++;
        }else if (valid(month + 1, 1, year)) {
            month++;
            day = 1;
        }else{
            year++;
            month = 1;
            day = 1;
        }
    }

    public void decrement() {
        if (valid(month, day - 1, year)) {
            day--;
        }else if (valid(month - 1, monthDays(month - 1, year), year)) {
            month--;
            day = monthDays(month, year);
        }else{
            year--;
            month = 12;
            day = 31;
        }
    }

    public void addDays(int days) {
        for (int i = 0; i < days; i++)
            this.increment();
    }

    public void removeDays(int days) {
        for (int i = 0; i < days; i++)
            this.decrement();
    }


    public String toString() {;
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    /*

	protected static int monthDays(int month, int year) {
        if (month == 2) {
            if (leapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

	protected static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static boolean validMonth(int month) {
        if (month < 1 || month > 12) return false;
        return true;
    }

    private static boolean valid(int month, int day, int year) {
        if (day < 1 || day > monthDays(month, year)) return false;
        return true;
    }*/


	
}
