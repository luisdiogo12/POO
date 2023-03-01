package aula3;

//Um fundo de investimento fornece uma taxa de juros mensal fixa, que acumula com o saldo 
//anterior do investimento (juros rendem juros). Escreva um programa em Java que peça ao 
//utilizador o montante investido (positivo e múltiplo de 1000) e a taxa de juro mensal (entre 
//0% e 5%). Verifique se os valores são válidos e apresente o valor mensal do fundo nos 
//próximos 12 meses, imprimindo o valor em cada mês. 

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double montante , taxa;
        while(true){
        Scanner sc = new Scanner(System.in);

        System.out.print("Montante investido: ");
        montante = sc.nextDouble();
        if (montante < 0 || montante % 1000 != 0) {
            System.out.println("Montante inválido");
            continue; // passa para o próximo loop
        }
        System.out.print("Taxa de juro mensal entre 0% e 5%: ");
        taxa = sc.nextDouble();
        if (taxa >= 0 && taxa <= 5 && montante > 0 && montante % 1000 == 0) {
            break;
        }
        System.out.println("Taxa inválida");
        sc.close();
    }

    for (int i = 1; i <= 12; i++) {
        montante += montante * taxa / 100;
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.printf("%10s: %.2f%n", meses[i - 1], montante);
    }
}
}
