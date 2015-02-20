/**
 * Calculator for basic math operations on floating point numbers.
 * 
 * @see BinaryOperator
 * @author khk
 *
 */
public class Calculator {
   public static BinaryOperator getAdder() {
      return (a, b) -> a + b;
   }
   
   public static BinaryOperator getSubtractor() {
      return (a, b) -> a - b;
   }
   
   public static BinaryOperator getMultiplier() {
      return (a, b) -> a * b;
   }
   
   public static BinaryOperator getDivider() {
      return (a, b) -> a / b;
   }
}
