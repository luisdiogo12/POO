package aula02;

//Escreva um programa que leia um conjunto de números reais do teclado, terminado por um 
//valor igual ao primeiro que foi introduzido. No fim, indique o valor máximo, o valor mínimo, 
//a média e o total de número lidos

import java.util.*;

public class Ex10 {


	public static void printArray(Double[] arr){
		System.out.println("Printing array...");
		for (Double k: arr){
			System.out.printf("%.2f\n" , k);
		}
	}

	public static Double[] arrayIncremet(Double[] numbers, Double n ){
		Double[] new_numbers = new Double[numbers.length + 1];

		for (int k = 0 ; k >= numbers.length  ; k++){
			new_numbers[k] = numbers[k];
			printArray(new_numbers);
		} 
		new_numbers[numbers.length] = n;
		return new_numbers;
	}
	public static void main(String[] args){
		System.out.println("Escreva um conjunto de numeros, o conjunto fecha quando quando for inserido um valor igual ao inicial");
		Scanner sc = new Scanner(System.in);
		Double[] numbers = {};
		Double[] numbers2 = new Double[1];
		printArray(numbers);
		System.out.println(numbers.length);
		printArray(numbers2);
		System.out.println(numbers2.length);
		Double n;
		do{
			System.out.print("Numero: ");
			n = sc.nextDouble();
			numbers2 = arrayIncremet(numbers2 , n);
			System.out.println(numbers2);
		}while(n != numbers2[numbers2.length]);

	}
	
}
