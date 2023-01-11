/*Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:

For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz.
*/

class FizzBuzz {
  public static void main(String[] args){
    for (int i = 0; i <= 100; i++){
      if (i % 15 == 0){
        System.out.println("FizzBuzz");
      } if (i % 3 == 0){
        System.out.println("Fizz");
      }  if (i % 5 == 0){
        System.out.println("Buzz");
      }  else {
        System.out.println(i);
      }
    }
  }
}