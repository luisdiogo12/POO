package aula2;

//Escreva um programa que calcule a energia necessária para aquecer a água desde uma 
//temperatura inicial até uma temperatura final. O programa deve ler a quantidade de água M 
//(em quilogramas), e as temperaturas inicial e final da água (em graus Celsius). A fórmula para
//calcular a energia Q (em Joules) é dada por: 
//Q = M * (finalTemperature - initialTemperature) * 4184

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        double m = 0, tempi = 0, tempf = 0;
        //Pq que aqui a variavél tem que ser inicializada quando
        //no exercicio 1 e 2 não precisou?
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()){
            //aqui dá uma desconfiguração estranha
            System.out.print("Massa da água (kg): ");
            m = sc.nextDouble();
            System.out.print("Temperatura inicial (Celsious): ");
            tempi = sc.nextDouble();
            System.out.print("Temperatura final (Celsious): ");
            tempf = sc.nextDouble();
            System.out.println("Energia necessária: " + (m * (tempf - tempi) * 4184) + " J");//eq só funciona se não ocorrer mudanças de estado
        }
        sc.close();


    }
    
}
