package aula04.Ex1;

import java.util.*;

public class Main {

	public static void defineCirclo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de circulos: ");
		int n = sc.nextInt();
		Circulo c[] = new Circulo[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Raio: ");
			double raio = sc.nextDouble();
			c[i] = new Circulo(raio);
			//System.out.println(c.toString());
		}
		sc.close();

	}
	public static void defineTriangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de trinagulos: ");
		int n = sc.nextInt();
		Triangulo t[] = new Triangulo[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Lado 1: ");
			double l1 = sc.nextDouble();
			System.out.print("Lado 2: ");
			double l2 = sc.nextDouble();
			System.out.print("Lado 3: ");
			double l3 = sc.nextDouble();
			t[i] = new Triangulo(l1, l2, l3);
			//System.out.println(t.toString());
		}
		sc.close();
	}
	public static void defineRetangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de retangulos: ");
		int n = sc.nextInt();
		Retangulo r[] = new Retangulo[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Comprimento: ");
			double comp = sc.nextDouble();
			System.out.print("Largura: ");
			double lag = sc.nextDouble();
			r[i]= new Retangulo(comp, lag);
			//System.out.println(r.toString());
		}
		sc.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Criar figuras geometricas:");
		System.out.print("Menu:\n1 - Circulo\n2 - Triangulo\n3 - Retangulo\nelse - Exit\nOpcao: ");
		String exit = "";
		do{
			int op = sc.nextInt();
			switch (op) {
				case 1:
				defineCirclo();
				break;
				case 2:
				defineTriangulo();
				break;
				case 3:
				defineRetangulo();
				break;
				default:
				exit = "exit";
				System.out.println("Opcao invalida");
			}
		}while(exit != "exit");
		sc.close();
	}
}
