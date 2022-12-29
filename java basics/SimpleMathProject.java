public class SimpleMathProject {
	public static void main(String[] args) {

    int myNumber = 5;//original number. Don't put it equal to 0'
		int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
	}
}//output is 3 no matter the value of myNumber