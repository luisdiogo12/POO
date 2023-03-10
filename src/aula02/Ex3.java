package aula02;

//Escreva um programa que calcule a energia necessária para aquecer a água desde uma 
//temperatura inicial até uma temperatura final. O programa deve ler a quantidade de água M 
//(em quilogramas), e as temperaturas inicial e final da água (em graus Celsius). A fórmula para 
//calcular a energia Q (em Joules) é dada por: 
//Q = M * (finalTemperature - initialTemperature) * 4184

import java.util.*;

public class Ex3 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a temperatura inicial, temperatura final e a massa respetivamente");
		Double tempI = sc.nextDouble();
		Double tempF = sc.nextDouble();
		Double Kg = sc.nextDouble();
		System.out.println("Energia necessária: " + (Kg*(tempF-tempI)));
		sc.close();
	}
}
