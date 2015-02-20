import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import calculator.BinaryOperator;
import calculator.Calculator;
import calculator.InvalidOperandException;

public class CalculatorTest {
   @Rule
   public ExpectedException exception = ExpectedException.none();
   
   /**
    * ADDITION
    ********************/
   
   @Test
   public void testAdd100And100() throws Exception {
      BinaryOperator op = Calculator.getAdder();
      double res = op.apply(100, 100);
      assertEquals(200, res, 0.1);
   }
   
   @Test
   public void testAddNeg100AndNeg100() throws Exception {
      BinaryOperator op = Calculator.getAdder();
      double res = op.apply(-100, -100);
      assertEquals(-200, res, 0.1);
   }

   @Test
   public void testAdd101And1() throws Exception {
      exception.expect(InvalidOperandException.class);
      
      BinaryOperator op = Calculator.getAdder();
      op.apply(101, 1);
   }

   @Test
   public void testAdd1And101() throws Exception {
      exception.expect(InvalidOperandException.class);
      
      BinaryOperator op = Calculator.getAdder();
      op.apply(1, 101);
   }

   @Test
   public void testAddNeg101And1() throws Exception {
      exception.expect(InvalidOperandException.class);
      
      BinaryOperator op = Calculator.getAdder();
      op.apply(-101, 1);
   }

   @Test
   public void testAdd1AndNeg101() throws Exception {
      exception.expect(InvalidOperandException.class);
      
      BinaryOperator op = Calculator.getAdder();
      op.apply(1, -101);
   }
   
   /**
    * DIVISION
    ********************/

   @Test
   public void testDivByZero() throws Exception {
      exception.expect(InvalidOperandException.class);
      
      BinaryOperator op = Calculator.getDivider();
      op.apply(1, 0);
   }
}
