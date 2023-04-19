package Calculator;
import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result = 0;
    System.out.println("First Number:");
    while (!scanner.hasNextDouble()) {
      System.out.println("Invalid input! Please enter a valid double value:");
      scanner.next();
    }
    double firstNumber = scanner.nextDouble();

    System.out.println("Second Number:");
    while (!scanner.hasNextDouble()) {
      System.out.println("Invalid input! Please enter a valid double value:");
      scanner.next();
    }
    double secondNumber = scanner.nextDouble();

    System.out.println("""
        Press a number to perform the assigned operation:\s
          1 - Addition\s
          2 - Subtraction\s
          3 - Multiplication  \s
          4 - Division""");

    while (!scanner.hasNextInt()) {
      System.out.println("Invalid input! Please enter a valid integer value:");
      scanner.next();
    }
    int operation = scanner.nextInt();

    switch (operation) {
      case 1 -> result = firstNumber + secondNumber;
      case 2 -> result = firstNumber - secondNumber;
      case 3 -> result = firstNumber * secondNumber;
      case 4 -> result = firstNumber / secondNumber;
      default -> System.out.println("Wrong input");
    }
    System.out.println("result:" + result);

  }
}
