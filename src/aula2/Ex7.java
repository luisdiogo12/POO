package aula2;

//Escreva um programa em Java que represente dois pontos, p1 e p2, pedindo que o utilizador 
//introduza as suas coordenadas reais x e y. Calcule e imprima a distância entre os pontos.
//Sugestão: para calcular a raiz quadrada use a função Math.sqrt.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;
        System.out.print("x1: ");
        x1 = sc.nextDouble();
        System.out.print("y1: ");
        y1 = sc.nextDouble();
        System.out.print("x2: ");
        x2 = sc.nextDouble();
        System.out.print("y2: ");
        y2 = sc.nextDouble();
        System.out.printf("Distância: %.2f\n", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        sc.close();
    }
    
}
