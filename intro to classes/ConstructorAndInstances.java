public class ConstructorAndInstances {
        //instant fields
        String productType;

        //constructor methods
        public ConstructorAndInstances(String product) {
            productType = product;
        }

        //main method
        public static void main(String[] args) {
            ConstructorAndInstances lemonadeStand = new ConstructorAndInstances("lemonade");
            System.out.println(lemonadeStand.productType);
        }


}// lemonade