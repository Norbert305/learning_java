public class HelloWorld {
  
	public static void main(String[] args) {
    
    String str = "Hello, World!";
    String str2 = " and Universe";
    // Examples:

    System.out.println(str.length());//13
    
    System.out.println(str.substring(4));//o, World!
    
    System.out.println(str.toUpperCase());//HELLO, WORLD! -. Upper Case
    System.out.println(str.toLowerCase());//hello world! -> lower case
    System.out.println(str.concat(str2));//Hello, World! and Universe
    System.out.println(str.indexOf("o"));//4 -> return index of character
    String x = "Hello, World!";
    System.out.println(str.equals(x));//true -> boolean same as ==
    System.out.println(str.charAt(1));//e -> input index to get character
    
  }
  
}