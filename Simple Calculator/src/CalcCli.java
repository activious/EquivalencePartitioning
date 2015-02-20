import java.util.Scanner;

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
   private static final String
         OP_ADD = "+", OP_SUB = "-",
         OP_MUL = "*", OP_DIV = "/";

   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter first number");
         double n1 = sc.nextDouble();
   
         System.out.println("Enter second number");
         double n2 = sc.nextDouble();
   
         System.out.println("Enter your operation");
         String op = sc.next();
   
         Calculator calc = new Calculator();
         double result = 0;
         
         switch (op) {
            case OP_ADD:
               result = calc.add(n1, n2);
               break;
            case OP_SUB:
               result = calc.sub(n1, n2);
               break;
            case OP_MUL:
               result = calc.mul(n1, n2);
               break;
            case OP_DIV:
               result = calc.div(n1, n2);
               break;
            default:
               System.out.println("Sorry, I don't support that operation :(");
               System.exit(1);
         }
         
         System.out.println("Your answer is " + result);
      }
   }
}
