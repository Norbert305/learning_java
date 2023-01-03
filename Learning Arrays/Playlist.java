import java.util.ArrayList;

class Playlist {


  public static void main(String[] args) {
    
  ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
  //My ArrayList Playlist---------------------------
  desertIslandPlaylist.add("Turn Up");
  desertIslandPlaylist.add("That's Fire");
  desertIslandPlaylist.add("Jerk");
  desertIslandPlaylist.add("Getting hot in here");
  desertIslandPlaylist.add("Got Swag");
  desertIslandPlaylist.add("Started from the bottom");
  desertIslandPlaylist.add("All White Everything");
  desertIslandPlaylist.add("Jesus Walks");

  //Lets remove a few songs here using the remove method--------------
  desertIslandPlaylist.remove("Jerk");
  desertIslandPlaylist.remove("Got Swag");
  desertIslandPlaylist.remove("Getting hot in here");
  //Lets locate the index of the selected songs here-----------------
  int x =  desertIslandPlaylist.indexOf("Jesus Walks");
  int y = desertIslandPlaylist.indexOf("Turn Up");
  //Lets swap 2 of the songs in the playlist---------------------
  desertIslandPlaylist.set(0, "Jesus Walks");
  desertIslandPlaylist.set(4, "Turn Up");
  //Lets execute our code below-------------------------------
  System.out.println(desertIslandPlaylist);
  System.out.println(desertIslandPlaylist.toString());
  System.out.println(desertIslandPlaylist.size());
  System.out.println(x);
  System.out.println(y);



  

  }
  
}