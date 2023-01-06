class Numbers {
    public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
        // Add your code below
  
        if (i % 5 != 0) {
       continue;
        }
  
           System.out.println(i);
      }
    }//output: 5 10 15 20 25 -> 95
  }
    
  
//   for (int i = 0; i < 10; i++) {

//         if (i == 4) {
//             break;
//         }

//         System.out.println(i)
//   } output: 1 2 3 4