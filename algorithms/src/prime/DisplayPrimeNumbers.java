package prime;

import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
      PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
      Scanner input = new Scanner(System.in);
      boolean isRunning = true;
      while(isRunning) {
        System.out.println("Select an option below");
        System.out.println("1. Check for Prime");
        System.out.println("2. Print primes in range");
        System.out.println("3. Print not primes in range");
        System.out.println("4. Exit");
        int option = input.nextInt();
        switch (option) {
          case 1:
            System.out.println("Enter the number");
            if (primeNumberCalculator.isPrime(input.nextInt())) {
              System.out.println("Given number is prime");
            } else {
              System.out.println("Given Number is not prime");
            }
            break;
          case 2:
            System.out.println("Enter Starting Number");
            int startNumber = input.nextInt();

            System.out.println("Enter Ending Number");
            int endNumber = input.nextInt();

            primeNumberCalculator.printPrimesInRange(startNumber, endNumber);
            break;
          case 3:
            System.out.println("Enter Starting Number");
            int startRange = input.nextInt();

            System.out.println("Enter Ending Number");
            int endRange = input.nextInt();

            primeNumberCalculator.printNotPrimesInRange(startRange, endRange);
            break;
          case 4:
            isRunning = false;
            System.out.println("Exiting the application");
            break;
          default:
            System.out.println("Unsupported option selected");
        }
      }
    }
  }