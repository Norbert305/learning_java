import java.util.ArrayList;

class Remove {
    
  public static void main(String[] args) {
    //Lets use the remove method below for our ArrayList
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Remove each to-do below:
    sherlocksToDos.remove("visit the crime scene");
    poirotsToDos.remove("visit the crime scene");
    sherlocksToDos.remove("play violin");
      
    System.out.println(sherlocksToDos.toString() + "\n");//output: [interview suspects, solve the case, apprehend the criminal]
    System.out.println(poirotsToDos.toString());//output: [interview suspects, let the little grey cells do their work, trim mustache, call all suspects together, reveal the truth of the crime]
  }
  
}