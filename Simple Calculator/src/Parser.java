public class Parser {
   private static final String SYM_ADD = "+", SYM_SUB = "-", SYM_MUL = "*",
         SYM_DIV = "/";

   public static BinaryOperator getOperator(String symbol) throws UnknownOperatorException {
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
            throw new UnknownOperatorException("Unknown operator: " + symbol);
      }
   }
}
