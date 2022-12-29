ublic class Song {
    public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    
    System.out.println(line1.equals(line2)); //false
    //line1 not equal to line2
    System.out.println(line2.equals(line3));//true
      //line2 equal to line3
  }       
}