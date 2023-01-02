// import the Arrays package here:
import java.util.Arrays;
public class Newsfeed {
  
  //Dont need constructor here! Don't be fooled. 
  public Newsfeed(){
    
  }
    

    //options to create public method and return your array
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }

    //options to creat public method and return your array
  public int[] getNumbers(){
    int[] numbers = {1, 2, 3, 4, 5};
    return numbers;
  }
  

  public static void main(String[] args){

//new instances array------------------------------

    
    
    //create new instances that can call the public methods above that are returning the arrays.
    Newsfeed sampleFeed = new Newsfeed();
    String[] topics = sampleFeed.getTopics();
      System.out.println(Arrays.toString(topics));
    //Same thing, new instance related to the public method above returning the array.
    Newsfeed sampleNumbers = new Newsfeed();
    int[] myNumbers = sampleNumbers.getNumbers();
    System.out.println(Arrays.toString(myNumbers));

    
    
    //creating straight up array----------------------


    //No new instances here!!!! No need!!! Can just call your array!!!
    int[] luckyNumbers = {23 ,24 ,35 , 07, 30};
    System.out.println(Arrays.toString(luckyNumbers));

       String[] luckyPlaces = {"Ocean" ,"Park" ,"Basketball Court" , "Video Game Arcade"};
System.out.println(Arrays.toString(luckyPlaces));



  }
}
