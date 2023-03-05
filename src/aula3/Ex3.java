package aula3;

//Escreva um programa que leia do teclado um número inteiro positivo e determine se o
//número introduzido é um número primo. Um número natural é um número primo quando
//tem exatamente dois divisores naturais distintos: o número 1 e ele mesmo. Repare que deve 
//validar o valor de entrada repetindo a leitura se o valor não for válido (positivo).

//import java.lang.Math; 
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    static public void main(String[] args) {
        String game = "";
        Scanner sc = new Scanner(System.in);

        do {
            // int random = (int) (Math.random() * 100); //duas maneiras diferentes de gerar
            // números aleatórios
            int random = new Random().nextInt(1, 100);
            int n;
            int cont = 0;

            while (true) {
                System.out.print("Numero entre 1 e 100: ");
                n = sc.nextInt();
                cont++;
                if (n > random) {
                    System.out.println("Alto");
                } else if (n < random) {
                    System.out.println("Baixo");
                } else {
                    System.out.println("Acertou");
                    break;
                }
            }
            System.out.println("Tentativas: " + cont);
            System.out.println("Novo jogo (S/Sim para continuar)");
            game = sc.nextLine();

        } while (game == "S" || game == "Sim");
        sc.close();
    }
    
}
