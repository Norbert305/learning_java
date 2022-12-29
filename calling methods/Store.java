public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      //creating a new method here in our class
      //We are concatinating our variables from the constructor 
          System.out.println("Selling " + productType + "!");
      System.out.println("Come spend some money!");
    }
    
    // main method
    public static void main(String[] args) {
      Store lemonadeStand = new Store("Lemonade");
      lemonadeStand.advertise();//calling our new methods
      lemonadeStand.advertise();//calling our new methods
      lemonadeStand.advertise();//calling our new methods
    }
  }//output: Selling Lemonade!
  //output: Come spend some money!
  //This is called 2 more times lol