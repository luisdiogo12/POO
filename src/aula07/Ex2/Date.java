package aula07.Ex2;

public abstract class Date {

	public abstract void set(int month, int day, int year);
	public abstract int getDay();
	public abstract int getMonth();
	public abstract int getYear();
	public abstract Date getDate();
	public abstract void increment();
	public abstract void decrement();
    public abstract String toString();
    public abstract void addDays(int days);
    public abstract void removeDays(int days);


	public static int monthDays(int month, int year) {
        if (month == 2) {
            if (leapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

	public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean validMonth(int month) {
        if (month < 1 || month > 12) return false;
        return true;
    }

    public static boolean valid(int month, int day, int year) {
        if (day < 1 || day > monthDays(month, year)) return false;
        return true;
    }


}
