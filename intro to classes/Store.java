
//My first constructor program with java!!!!!!

public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method
    public Store(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("lemonade", 42, .99);
      Store cookieShop = new Store("cookies", 12, 3.75);
      
      System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
      System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
  }//output: Our first shop sells lemonade at 0.99 per unit.
  //output: Our second shop has 12 units remaining.

  //lemonadeStand.productType = "lemonade";
  //lemonade.inventoryCount = 42;
  //lemonade.inventoryPrice = 0.99

  //cookieShop.productType = "cookies";
  //cookieShop.inventoryCount = 12;
  //cookieShop.inventoryPrice = 3.75