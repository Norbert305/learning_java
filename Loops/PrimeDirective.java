// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
// what is prime?? a number gretaer than 1 and only deivisable by 1 and itself. 


//This is our new method -> pd.isPrime(7)
  public boolean isPrime(int number) {
 //boolean in our method means we will return a boolean
    //the int number in our perams means a number will be stored inside.
      if (number > 1) {
//This checks to see if number is prime using the for loop inside of our condition
           for (int i = 2; i < number; i++) {
          if (number % i == 0) {
            return false;
          }
        }
        //if number > 1: return true 
        return true;
        //else return false
      } else {
        return false;
      }    
  }


  //Here is our ArrayList---------------

  //Job here is to find and store all the numbers in the ArrayList -> pd.onlyPrimes() -> [29,11,101,43,89]


  //Our ArrayList contains a normal array of integers called ***int[] numbers*** in the parameter
  //This represents pd.onlyPrimes(numbers); below
public ArrayList<Integer> onlyPrimes(int[] numbers) {
 
  // method body goes here
  ArrayList<Integer> primes = new ArrayList<Integer>();
 

 for (int i : numbers) {
  //if isPrime(i), public method made obeove. Is true then primes variable in our ArrayList adds that number entered in primes(entered)
 if (isPrime(i) == true) {
    //This appends all the prime numbers in our ArrayList called primes but the ArrayList onlyPrimes executes our data. 
   primes.add(i);
 }
}

    return primes;
    //We return primes ArrayList here
}


  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    //***pd*** is the variable created for our new intsance object 
    System.out.println(pd.isPrime(6));//false
    System.out.println(pd.isPrime(7));//true
    System.out.println(pd.isPrime(28));//false
    System.out.println(pd.isPrime(3));//true
    System.out.println(pd.isPrime(0));//false

    //This array numbers will be used above in the params for our ArrayList pd.onlyPrimes()
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.onlyPrimes(numbers));

    // command line turminal: java PrimeDirective -> runs code
    // command line turminal: javac PrimeDirective.java -> checks cod

  }  

}

  //How For Each Loop works:
//   (int **i** is the index : numbers is the array) {
            // System.out.println(i)
//   }