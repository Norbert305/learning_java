public class DNA {
 
    public static void main(String[] args) {
      
      // DNA Sequencing
  
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
  
    String dna = dna1;
  
   int dnaLength = dna.length();
    System.out.println(dnaLength);
  
    int dnaStart = dna.indexOf("ATG");
    int dnaEnd = dna.indexOf("TGA");
     System.out.println("Start: "+dnaStart);
     System.out.println("Stop: "+dnaEnd);
  
  if (dnaStart != -1 && dnaEnd != -1) {
    System.out.println("Condition 1 and 2 are satisfied.");
  }
  if (dnaStart != -1 && dnaEnd != -1 && (dnaEnd - dnaStart) % 3 == 0) {
    System.out.println("Condition 1 and 2 and 3 are satisfied.");
  }
  // String protein = dna.subtracting(3,8);
  // System.out.println("protein avalable: "+protein);
  
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
   
    }
   
  }