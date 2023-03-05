package aula02;

//Pretende-se calcular a velocidade média de transporte do ponto A para o ponto B sendo a 
//viagem feita em duas etapas, cujo comprimento pode ser diferente. Escreva um programa que 
//solicite a inserção da velocidade (v1) e distância (d1) percorrida no primeiro trajeto, bem 
//como a velocidade (v2) e a distância (d2) percorrida no segundo trajeto. Com base nestes 
//valores calcule e imprime a velocidade média final. 

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, d1, v2, d2;
        System.out.print("V1: ");
        v1 = sc.nextDouble();
        System.out.print("D1: ");
        d1 = sc.nextDouble();
        System.out.print("V2: ");
        v2 = sc.nextDouble();
        System.out.print("D2: ");
        d2 = sc.nextDouble();
        double media = (d1 + d2)/*distância dos 2 percursos */
        / (d1 / v1 + d2 / v2) /*tempo de cada percurso*/;
        System.out.println("Velocidade média final: " + media);
        sc.close();
    }
    
}
