package aula03;

/*
Implemente um programa que leia do teclado as notas da componente prática (notaP) e 
teórica (notaT) de uma turma.
Defina uma função para calcular a nota final de um aluno a partir das notas das componentes 
prática e teórica, da seguinte forma:
• 66 (reprovado por nota mínima), se tiver obtido menos do que 7.0 em pelo menos
uma das componentes;
• 0.4 * notaT + 0.6 * notaP (arredondada a unidades), nos restantes casos.
O programa deve começar por perguntar o número de alunos na turma. De seguida, crie um 
vetor bidimensional para armazenar as notas das componentes teórica e prática de todos os 
alunos e preencha-o com valores aleatórios (mas válidos, i.e. as notas podem variar de 0.0 a 
20.0; arredonde os valores às décimas).
Processe as notas e imprima os resultados com o formato seguinte */

import java.util.Random;
import java.util.Scanner;

public class Ex4erro {
    private static int NotaF(double notaP, double notaT) {
        if (notaP < 7.0 || notaT < 7.0) {
            return 66;
        }
        return (int) (0.4 * notaT + 0.6 * notaP);
    }

    private static void PrintPauta(double[][] notas){
        System.out.println("Nota P Nota T Nota F");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%7.2d %7.2d %7n\n", notas[i][0], notas[i][1] , NotaF(notas[i][0], notas[i][1]));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();   

        System.out.print("Número de alunos: ");
        int num = sc.nextInt();
        double notas[][]= new double[num][2];

        for (int i = 0;  i == num -1; i++){
            notas[i][0] = random.nextDouble(0.0, 20.0);
            notas[i][1] = random.nextDouble(0.0, 20.0);
        }
        System.out.println(notas);
        PrintPauta(notas);
        sc.close();


    }
}
