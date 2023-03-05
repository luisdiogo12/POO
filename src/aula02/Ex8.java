package aula02;

//Dado um triângulo retângulo de catetos A e B e hipotenusa C, escreva um programa que leia 
//o valor dos catetos e determine o valor da hipotenusa, bem como o valor do ângulo (em 
//graus) entre o lado A e a hipotenusa.

import java.util.Scanner;

public class Ex8 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Comprimento de um cateto:");
        Double c1 = sc.nextDouble();
        System.out.println("Comprimento do outro cateto: ");
        Double c2 = sc.nextDouble();
        
        Double hip = Math.sqrt( c1*c1 + c2*c2);
        Double ang = Math.toDegrees(Math.atan(c1 / c2));

        System.out.println("Hipotenusa: " + hip);
		System.out.println("Angulo: " + ang);


        sc.close();


    }
    
}
