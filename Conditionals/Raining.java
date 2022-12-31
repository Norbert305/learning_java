public class Raining {

    public static void main(String[] args) {
      int temp = 45;
  boolean raining = true;
   
  if (temp < 60) {
    //nested if statement
    System.out.println("Wear a jacket!");
    if (raining == true) {
        //both if statements are true so both will print!!!
      System.out.println("Bring your umbrella.");
    } else {
      System.out.println("Leave your umbrella home.");
    }
  }
    }
  
  }//output: Wear a jacket!
  //output: Bring your umbrella.