public class Matrix {

    
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};
    
		// Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
    int retrievedInt = intMatrix [0][3];
    System.out.println(retrievedInt);//output: 1

		// Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
    System.out.println(intMatrix[1][2] * 3);//output 18

    int counter = 0;


    for (int i = 0; i < intMatrix.length; i++) {
      for (int j = 0; j < intMatrix[i].length; j++) {
        counter += intMatrix[i][j];
      }
    }

System.out.println(counter);//output: 60



    }
}