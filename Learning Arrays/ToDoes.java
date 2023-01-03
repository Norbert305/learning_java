import java.util.ArrayList;

class ToDos {
    //adding values to the back of the array using the add method
  public static void main(String[] args) {
    
    //create empty array list called toDoList
    ArrayList<String> toDoList = new ArrayList<String>();
    //create new values--------------------
    String toDo1 = "Water plants";
    String toDo2 = "Do laundry";
    String toDo3 = "Pet Ham and Ghoti until they purr";
    
    // Add to-dos to toDoList-------------------
    //add methods appends value to the back of array.
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    System.out.println(toDoList);
      
    
  }//output: [Water plants, Do laundry, Pet Ham and Ghoti until they purr]
  
}