public class Plaza {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method
    public Plaza(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
      Plaza cookieShop = new Plaza("cookies",12,3.75);
      System.out.println("I have "+cookieShop.inventoryCount+ " "+ cookieShop.productType+ " that cost me $"+cookieShop.inventoryPrice+ " dollars!!!!!");
    }
  }//output: I have 12 cookies that cost me $3.75 dollars!!!!!