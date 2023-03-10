package aula02;

//Um fundo de investimento fornece uma taxa de juros mensal fixa, que acumula com o saldo 
//anterior do investimento (juros rendem juros). Escreva um programa em Java que peça ao 
//utilizador o montante investido e a taxa de juro mensal. Indique o valor total ao final de 3 
//meses. (Por exemplo, para um investimento de 5000 euros e uma taxa de 1% o montante ao fim de 3 
//meses será de 5151.505 euros).

import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montante, taxa;
        System.out.print("Montante investido: ");
        montante = sc.nextDouble();
        System.out.print("Taxa de juro mensal: ");
        taxa = sc.nextDouble();
        sc.close();
        Double monatntef = montante * Math.pow((1 + (taxa/100)), 3);
        System.out.printf("Valor final do montante: %.2f\n", monatntef);
    }
	
}
