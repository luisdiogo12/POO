package aula02;

//Escreva um programa que lê um valor real que especifica temperatura em graus Celsius, 
//converte-o para graus Fahrenheit e imprime o resultado. A fórmula de conversão de graus 
//Celsius (C) para graus Fahrenheit (F) é a seguinte: F = 1.8 ∗ C + 32.

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = 1.8 * celsius + 32;
		System.out.println("Fahrenheit: " + fahrenheit);
		sc.close();
	}
	
}
