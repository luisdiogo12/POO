package aula04.Ex4;

import java.util.Scanner;

class Car {

  public String make;
  public String model;
  public int year;
  public int kms;

  public Car(String make, String model, int year, int kms) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.kms = kms;
  }

  public void drive(int distance) {
    this.kms += distance;
  }
}

public class CarDemo {

  static Scanner sc = new Scanner(System.in);

  static int registerCars(Car[] cars) {
    //pede dados dos carros ao utilizador e acrescenta ao vetor
    // registo de carros termina quando o utilizador inserir uma linha vazia
    // devolve número de carros registados
    int n = 0;
    do {
      System.out.print(
        "Insira dados do carro (marca modelo ano quilómetros): "
      );
      String input = sc.nextLine(); // lê apenas depois de ": "
      if (input.isEmpty()) break;
      String[] data = input.split(" ");
      if (data.length < 4) { // a verificação de dados ainda não funciona muito bem ex: "Renault Megane Sport Tourer 35356" não dá erro
        System.out.println("Dados inválidos!");
        continue;
      }
      String name = data[0];
      String model = "";// tem que ser inicializado
      int year = 0;// tem que ser inicializado
      int kms;

      for (int i = 1; i < data.length; i++) {
        if (data[i].matches("\\d+")) {
          int num = Integer.parseInt(data[i]);
          if (num > 1900 && num < 3000) { // confirmar se a data é valida
            year = num;
            break;
          }
        } else {
          model += data[i] + " "; 
        }
      }
      model = model.trim();
      kms = Integer.parseInt(data[data.length - 1]);
      cars[n] = new Car(name, model, year, kms);
      n++;
    } while (n < cars.length);
    return n;
  }

  static void registerTrips(Car[] cars, int numCars) {
    // pede dados das viagens ao utilizador e atualiza informação do carro
    // registo de viagens termina quando o utilizador inserir uma linha vazia

    System.out.print("Registe uma viagem no formato \"carro:distância\": ");
    String input = sc.nextLine();
    if (input.isEmpty()) return;
    String[] data = input.split(":");

    cars[Integer.parseInt(data[0])].drive(Integer.parseInt(data[1]));
  }

  static void listCars(Car[] cars) {
    System.out.println("\nCarros registados: ");
    // lista todos os carros registados
    // Exemplo de resultado
    // Carros registados:
    // Toyota Camry, 2010, kms: 234346
    // Renault Megane Sport Tourer, 2015, kms: 32536
    int i = 0;
    do{  // com o numero de carros e não com o tamanho do array
      System.out.printf(
        "%s %s, %d, kms: %d  \n",
        cars[i].make,
        cars[i].model,
        cars[i].year,
        cars[i].kms
      );
      i ++;
    }while(cars[i] != null ); //tenho que comparar com o array e não com os elementos do objeto (car[i].make != null não funciona nem com car[i].make !="")

    System.out.println("\n");
  }

  public static void main(String[] args) {
    Car[] cars = new Car[10];

    int numCars = registerCars(cars);

    if (numCars > 0) {
      listCars(cars);
      registerTrips(cars, numCars);
      listCars(cars);
    }

    sc.close();
  }
}
