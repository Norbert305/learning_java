public class Shop {
    // instance fields
    String productType;
    
    // constructor method
    public Shop(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
    
    public void greetCustomer(String customer){
      System.out.println("Welcome to the Shop, " + customer + "!");
    }
    
    // main method
    public static void main(String[] args) {
      Shop lemonadeStand = new Shop("Lemonade");
      
      lemonadeStand.greetCustomer("Laura");
      
    }
  }  //output: Welcome to the store, Laura!