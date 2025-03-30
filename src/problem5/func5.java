package problem5;

public class func5 {
    /**
     * This method finds the nth Fibonacci number using recursion
     * Time complexity: O(2^n) due to redundant calculations
     * @param n The position in the Fibonacci sequence
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}