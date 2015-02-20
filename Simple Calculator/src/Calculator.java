/**
 * Calculator for basic math operations on floating point numbers.
 * 
 * @see BinaryOperator
 * @author khk
 *
 */
public class Calculator {
   public static BinaryOperator getAdder() {
      return (a, b) -> {
         validate(a, b);
         return a + b;
      };
   }

   public static BinaryOperator getSubtractor() {
      return (a, b) -> {
         validate(a, b);
         return a - b;
      };
   }

   public static BinaryOperator getMultiplier() {
      return (a, b) -> {
         validate(a, b);
         return a * b;
      };
   }

   public static BinaryOperator getDivider() {
      return (a, b) -> {
         if (b == 0)
            throw new InvalidOperandException("Division by zero is not allowed");

         validate(a, b);
         return a / b;
      };
   }

   private static void validate(double a, double b) throws InvalidOperandException {
      if (a < -100 || a > 100 || b < -100 || b > 100)
         throw new InvalidOperandException("Values of operands must be within [-100;100]");
   }
}
