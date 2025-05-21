package ci_cddemo;


public class calculatorService {

    /**
     * Returns the sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns the result of subtracting b from a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the integer division of a by b.
     * Throws IllegalArgumentException if b is zero.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
