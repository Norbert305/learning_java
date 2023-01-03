import java.util.Arrays;

class Shopping {
  //updating the last value of the array
  public static void main(String[] args) {
    
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
    
    // Adding ham to the groceries
    groceryItems[2] = "ham";
    prices[2] = 4.99;
    prices[prices.length -1] = 5.50;
    groceryItems[groceryItems.length -1] = "cheese";

    System.out.println(Arrays.toString(prices));//output: [25.0, 2.95, 5.5]
    System.out.println(Arrays.toString(groceryItems));//outout: [steak, milk, cheese]
    
  }
  
}