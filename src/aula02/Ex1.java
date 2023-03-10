package aula02;

//Escreva um programa que lê um valor real que representa uma distância em quilómetros, 
//converte-o para milhas e imprime o resultado. A fórmula de conversão é a seguinte: Milhas = 
//Quilómetros / 1.609.

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Km: ");
		double km = sc.nextDouble();
		double milhas = km / 1.609;
		System.out.println("Milhas: " + milhas);
		sc.close();
	}
	
}
