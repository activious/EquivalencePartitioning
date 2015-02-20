import java.util.Scanner;

import parser.Parser;
import parser.UnknownOperatorException;
import calculator.BinaryOperator;
import calculator.Calculator;
import calculator.InvalidOperandException;

/**
 * Command line interface for a basic calculator.
 * 
 * Inspired by <a href=
 * "http://codereview.stackexchange.com/questions/40615/simple-java-calculator"
 * >simple-java-calculator</a>.
 * 
 * @see Calculator
 * @author khk
 * 
 */
public class CalcCli {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Enter first number: ");
         double n1 = sc.nextDouble();

         System.out.print("Enter second number: ");
         double n2 = sc.nextDouble();

         System.out.print("Enter your operation: ");
         String symbol = sc.next();

         System.out.println();
         try {
            BinaryOperator op = Parser.getOperator(symbol);
            System.out.println("Your answer is " + op.apply(n1, n2));
         } catch (UnknownOperatorException e) {
            System.out.println("Sorry, I don't know that operation :(");
            System.exit(1);
         } catch (InvalidOperandException e) {
            System.out.println("Oops! " + e.getMessage());
            System.exit(2);
         }
      }
   }
}
