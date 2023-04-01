package aula02;

//Escreva um programa que dado um tempo em segundos lido do teclado, mostre na consola o 
//tempo com o formato hh:mm:ss. Sugestão: para calcular o resto da divisão inteira existe o operador %.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Segundos: ");
        int sec = sc.nextInt();
        System.out.printf("%02dh:%02dm:%02ds\n",
        sec / 3600,
        (sec % 3600) / 60,
        sec % 60);
        sc.close();
    }
    
}
