package calculator;
@FunctionalInterface
public interface BinaryOperator {
   double apply(double a, double b) throws InvalidOperandException;
}
