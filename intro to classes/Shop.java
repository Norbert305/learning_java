public class Shop {
  
    // new method: constructor!
    public Shop() {
       System.out.println("I am inside the constructor method.");
    }
    
    // main method is where we create instances!
    public static void main(String[] args) {
      System.out.println("Start of the main method.");
      
      // create the instance below
      Shop lemonadeStand = new Shop();
      // print the instance below
     System.out.println(lemonadeStand);
    }
  }//output: Start of the main method.
//output: I am inside the constructor method.
//output: Store@2aae9190