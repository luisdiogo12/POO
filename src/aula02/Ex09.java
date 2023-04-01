package aula02;

//Escreva um programa que imprima uma contagem decrescente (até 0) a partir de um valor
//positivo N, introduzido pelo utilizador através do teclado. Escreva o output numa única
//linha, separando os números por vírgulas. Extra: introduza uma quebra de linha sempre que escreve
//um número múltiplo de 10

import java.util.*;

public class Ex09 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // falta garantir que só dá input R+
    System.out.println(
      "Introduza o numero de iniciação de contagem decrescente"
    );
    int n;
    do {
      n = sc.nextInt();
      if (n <= 0) {
        System.out.println("Tem que ser maior que 0");
      }
    } while (n <= 0);

    for (int i = n; i >= 0; i--) {
      if (i % 10 == 0) {
        System.out.printf("\n");
      }
      System.out.printf("%d, ", i);
    }
    sc.close();
  }
}
