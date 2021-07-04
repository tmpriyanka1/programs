package number.utilities;

public class NumberUtility
{
  /**
   * method to display fibonacci numbers
   * @param number
   *    enter the last number in the range
   */
  public void displayFibonacci (int number)
  {
    int firstNumber = 0;
    System.out.println(firstNumber);

    int secondNumber = 1;
    while(secondNumber <= number)
    {
      System.out.println(secondNumber);
      int nextNumber = firstNumber + secondNumber;
      firstNumber = secondNumber;
      secondNumber = nextNumber;
    }
  }

  /**
   * method to find the given number is palindrome or not
   * @param number
   *     input number
   */
  public boolean isPalindrome (int number)
  {
    int remainder=0;
    int reverse=0;
    int num=number;
    while(num>0)
    {
      remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num = num/10;
    }
    if (number == reverse)
    {
      return true;
    }
    return false;
  }

  /**
   * method to calculate the factorial of a given number
   * @param num
   * enter the number to find factorial
   *
   */
  public int getFactorial (int num)
  {
    int factorial=1;
    while(num > 1)
    {
      factorial = factorial * num;
      num--;
    }
    return factorial;
  }
}
