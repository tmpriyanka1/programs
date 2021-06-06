package prime;

public class PrimeNumberCalculator {
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


  public void printPrimesInRange(int start, int end) {
    System.out.println("Prime Numbers Between " +start+ " to " +end+  " are:");
    while(start <= end) {
      if(isPrime((start))) {
        System.out.println(start);
      }
      start++;
    }
  }
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
