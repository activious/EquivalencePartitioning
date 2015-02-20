public class Parser {
   private static final String SYM_ADD = "+", SYM_SUB = "-", SYM_MUL = "*",
         SYM_DIV = "/";

   public static BinaryOperator getOperator(String symbol) {
      switch (symbol) {
         case SYM_ADD:
            return Calculator.getAdder();
         case SYM_SUB:
            return Calculator.getSubtractor();
         case SYM_MUL:
            return Calculator.getMultiplier();
         case SYM_DIV:
            return Calculator.getDivider();
         default:
            throw new IllegalArgumentException("Unknown operator: " + symbol);
      }
   }
}
