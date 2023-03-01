package aula3;

//Escreva um programa que leia do teclado um número inteiro positivo e devolva a soma de 
//todos os números primos até esse valor (inclusive). Repare que deve validar o valor de 
//entrada repetindo a leitura se o valor não for válido (positivo).
//Deve implementar uma função que devolva se um número é um número primo. Um número 
//natural é um número primo quando tem exatamente dois divisores naturais distintos: o 
//número 1 e ele mesmo.

import java.util.Scanner;

public class Ex1 {

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int n;// tenho que declarar fora do loop para poder ser chamado fora do scoope
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Número inteiro: ");
            n = sc.nextInt(); 
            if (n > 0) {
                break;
            }
            System.out.println("Valor inválido");
            sc.close();
        }

        int soma = 0;
        
        for (int i = 0; i <= n ; i++) {
            if (isPrime(i)) {
                soma += i;
            }
        }
        System.out.println(soma);
    }

}
