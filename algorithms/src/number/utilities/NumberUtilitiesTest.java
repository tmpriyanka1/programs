package number.utilities;

import java.util.Scanner;

public class NumberUtilitiesTest {
  /**
   * Main method to start the program.
   */
  public static void main(String[] args) {
    // Instance creation for NumberUtility.
    NumberUtility numberUtility = new NumberUtility();
    Scanner input = new Scanner(System.in);
    boolean isRunning = true;

    while(isRunning) {
      System.out.println("Select an option below");
      System.out.println("1. Print fibonacci series");
      System.out.println("2. Palindrome or Not");
      System.out.println("3. Factorial");
      System.out.println("4. Exit");
      int option = input.nextInt();
      switch (option) {
        case 1:
          System.out.println("Enter the last number");
          int endNumber = input.nextInt();
          numberUtility.displayFibonacci(endNumber);
          break;
        case 2:
          System.out.println("Enter the number");
          int number = input.nextInt();
          if(numberUtility.isPalindrome(number))
          {
            System.out.println("The number is a palindrome");
          }
          else {
            System.out.println("The number is not a palindrome");
          }
          break;
        case 3:
          System.out.println("Enter the number");
          int num = input.nextInt();
          System.out.println("The factorial is "+ numberUtility.getFactorial(num));
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
