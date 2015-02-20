import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import parser.Parser;
import parser.UnknownOperatorException;

public class ParserTest {
   @Rule
   public ExpectedException exception = ExpectedException.none();

   @Test
   public void testAddSymbol() throws Exception {
      Parser.getOperator("+");
   }

   @Test
   public void testSubSymbol() throws Exception {
      Parser.getOperator("-");
   }

   @Test
   public void testMulSymbol() throws Exception {
      Parser.getOperator("*");
   }

   @Test
   public void testDivSymbol() throws Exception {
      Parser.getOperator("/");
   }
   
   @Test
   public void testAmpersand() throws Exception {
      exception.expect(UnknownOperatorException.class);
      
      Parser.getOperator("&");
   }
}
