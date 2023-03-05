package aula02;

//Escreva um programa que lê um valor real que especifica temperatura em graus Célsius, 
//converte-o para graus Fahrenheit e imprime o resultado. A fórmula de conversão de graus 
//Célsius (C) para graus Fahrenheit (F) é a seguinte: F = 1.8 ∗ C + 32.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        double celsius ,  fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        sc.close();
    }
    
}
