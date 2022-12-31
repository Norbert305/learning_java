
public class Droid {

    //instance field
    int batteryLevel;
    String name;
    
    //my tostring method
     public String toString() {
        return "Hello there, I am a droid named" + name + " and my battery life is "+batteryLevel+"%!!!!";
      }
    
    
    
    //my constructor method
    public Droid(String droidName) {
    
    name = droidName;
    
    batteryLevel = 100;
    
    }
    
    
    //new Method does not return anything so void
    public void performTask(String task) {
      task = "dancing";
      System.out.println(name+" is performing "+task+" moves!!!!");
      //output: Codey is performing dancing moves!!!!
    }
    
    
    //main method
    public static void main(String[] args) {
        //create a new instance in the main called newName
        Droid newName = new Droid("Codey");//newName.name -> Codey
        System.out.println(newName);//output: Hello there, I am a droid namedCodey and my battery life is 100%!!!!
        newName.performTask("dancing");//how to call new methods
    }
    
    
    
    }