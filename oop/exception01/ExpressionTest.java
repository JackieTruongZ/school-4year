
public class ExpressionTest {

        /**
         * Expression test.
         * expression :  (10^2 - 3 + 4*3)^2
         */
        public static void main(String[] args) {
                // Tạo biểu thức  (10^2 - 3 + 4*3)^2
                Expression expression = new Square(
                        new Addition(
                                new Subtraction(
                                        new Square(
                                                new Numeral(10)
                                        ),
                                        new Numeral(3)
                                ),
                                new Multiplication(
                                        new Numeral(4),
                                        new Numeral(3))
                        )
                );

        // In ra biểu thức và kết quả
        System.out.println("Biểu thức: " + expression);
        System.out.println("Kết quả: " + expression.evaluate());
    }
}