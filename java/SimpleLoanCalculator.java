/*In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment
*/

public class CarLoan {
 public static void main(String[] args)   {
  int carLoan = 10000;
  int loanLength = 3;
  int intrestRate = 5;
  int downPayment = 2000;

    if (loanLength <= 0 || intrestRate <= 0){
       System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment > carLoan){
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalence =  remainingBalance/ months;
      int interest = monthlyBalence * intrestRate / 100;
      int monthlyPayment = monthlyBalence + interest;
      System.out.println(monthlyPayment);
    }
	

	}
}
