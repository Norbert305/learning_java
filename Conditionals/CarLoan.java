public class CarLoan {
	public static void main(String[] args) {
    //Variables created below
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
//my conditionals to calculate the car payment based on the car loan.
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    }
    else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (months * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
	}
}