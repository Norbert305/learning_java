import java.util.ArrayList;

class ArrayList {
    
  public static void main(String[] args) {
    //Lets use our ArrayList to append the data by using the add method
    //Then we will use the get method to print the index of that data
    // Sherlock - name of detective
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot - name of detective
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println("Sherlock's third to-do:");//output: Sherlock's third to-do:
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));//output: interview suspects
    
    System.out.println("Poirot's second to-do:");//output: Poirot's second to-do:
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));//output: interview suspects

//-------------------------------------------------------
   //here we will print out the array with changes to it
    double[] ratings = {3.2, 2.5, 1.7};
  //lets print the 1 index of the ratings array
    System.out.println(ratings[1]);//output: 2.5
    //lets print out the last index of the array
    System.out.println(ratings[ratings.length -1]);//output: 1.7
    //lets change the value of the first element of the array
    ratings[0] = 2.9;
    System.out.println(ratings[0]);//output: 2.9
    
  }
  
}