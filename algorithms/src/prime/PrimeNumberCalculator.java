package prime;
/**
 * Class to calculate prime number
 *
 * @author Malathi Priyanka Tatikonda
 */
public class PrimeNumberCalculator {
  /**
   * method to find given number is prime or not
   * @param number
   * enter the number to find prime
   *
   */
  public boolean isPrime(int number) {
    if(number <= 1)
    {
      return false;
    }
    else{
      for (int i = 2; i <= number/2 ; i++)
      {
        if (number % i == 0)
        {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * method to display prime numbers between given range
   * @param start
   * enter the number the range starting from
   *@param end
   * enter the number the range ending
   */
  public void printPrimesInRange(int start, int end) {
    System.out.println("Prime Numbers Between " +start+ " to " +end+  " are:");
    while(start <= end) {
      if(isPrime((start))) {
        System.out.println(start);
      }
      start++;
    }
  }

  /**
   * method to display not prime numbers between given range
   * @param start
   * enter the number the range starting from
   *@param end
   * enter the number the range ending
   */
  public void printNotPrimesInRange(int start, int end) {
    System.out.println("Not Prime Numbers Between " +start+ " to " +end+  " are:");
    while(start <= end) {
      if(!isPrime((start))) {
        System.out.println(start);
      }
      start++;
    }
  }
}
