package aula04.Ex2;

class Product {

  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double getTotalValue() {
    return price * quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}

class CashRegister {

  private Product[] products; //vetor de objetos da classe Product(name,price,quantity)

  public void addProduct(Product product) {
    if (products == null) {
      products = new Product[1];
      products[0] = product;
    } else {
      Product[] newProducts = new Product[products.length + 1];
      for (int i = 0; i < products.length; i++) {
        newProducts[i] = products[i];
      }
      newProducts[products.length] = product;
      products = newProducts;
    }
  }
  
  public void tabProducts(){
    System.out.printf(
      "%-10s%10s%10s%10s",
      "Product",
      "Price",
      "Quantity",
      "Total\n"
    );
    for (int i = 0; i < products.length; i++) {
      System.out.printf(
      "%-10s%10.2f%10d%10.2f\n",
      products[i].getName(),
        products[i].getPrice(),
        products[i].getQuantity(),
        products[i].getTotalValue()
    );
    }
  }
  /* 
  public String toString() {
    return String.format(
      "%-10s%10s%10s%10s",
      "Product",
      "Price",
      "Quantity",
      "Total\n"
    );
  }*/
}

public class CashRegisterDemo {

  public static void main(String[] args) {
    // Cria e adiciona 5 produtos
    CashRegister cr = new CashRegister();
    cr.addProduct(new Product("Book", 9.99, 3));
    cr.addProduct(new Product("Pen", 1.99, 10));
    cr.addProduct(new Product("Headphones", 29.99, 2));
    cr.addProduct(new Product("Notebook", 19.99, 5));
    cr.addProduct(new Product("Phone case", 5.99, 1));

    // TODO: Listar o conteúdo e valor total
    cr.tabProducts();
  }
}
