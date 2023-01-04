// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
      if (number > 1) {
           for (int i = 2; i < number; i++) {
          if (number % i == 0) {
            return false;
          }

        }
        return true;
      } else {
        return false;
      }    
  }

public ArrayList<Integer> onlyPrimes(int[] numbers) {
 
  // method body goes here
  ArrayList<Integer> primes = new ArrayList<Integer>();
 
 for (int i : numbers) {
  // do something with animal
 if (isPrime(i) == true) {
   primes.add(i);
 }
}
    return primes;
}


  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(6));
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));

    System.out.println(pd.onlyPrimes(numbers));


  }  

}