/*In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you choose.

The instructions provided are general guidelines. Upon completion of the project, feel free to explore the code on your own.
*/

public class Magic {
	public static void main(String[] args) {

		int myNumber =  83;
    // myNumber will be called orginal number from here on.
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.print(stepSix);
	}
}
