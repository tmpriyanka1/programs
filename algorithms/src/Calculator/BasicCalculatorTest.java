package Calculator;

import java.util.Scanner;

public class BasicCalculatorTest {

  public static void main(String[] args) {
    boolean isRunning = true;

    BasicCalculator basicCalculator = new BasicCalculator();
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number");
    int number = input.nextInt();
    char s;
    while (isRunning) {

      System.out.println("Enter the operator or Enter 's' to exit" );
      char operator = input.next().charAt(0);
      if(operator == 's')
      {
        isRunning = false;
        System.out.println("Exiting the application" );
      }
      else
      {
          System.out.println("Enter the number");
          int number1 = input.nextInt();

          switch (operator)
          {
          case '+':
            System.out.println(number = basicCalculator.addNumbers(number, number1));
            break;
          case '-':
            System.out.println(number = basicCalculator.subtractNumbers(number, number1));
            break;
          case '*':
            System.out.println(number = basicCalculator.multiplyNumbers(number, number1));
            break;
          case '/':
            System.out.println(number = basicCalculator.divideNumbers(number, number1));
            break;
          default:
            System.out.println("Unsupported option selected");
            isRunning = false;
        }

        }
      }
    System.out.println("The final calculation for given numbers = " +number+ ""  );
    }
  }

