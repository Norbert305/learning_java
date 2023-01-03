import java.util.ArrayList;

class ToDoList {
    
  public static void main(String[] args) {

    //use the add method again to append the data to the array.
    //use the size() method to print the number of things appended.
    //String.out.println(myArray.size());
    
    
    // Sherlock
    //Sum the number of items on sherlock's to do list
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    //Sum the number of items on Poirot's' to do list
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());//output: 5
    System.out.println(poirotsToDos.size());//output: 6
      
    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirot");//output: Poirot
  }
  
}