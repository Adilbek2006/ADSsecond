package problem6;

public class func6 {
    /**
     * Recursively calculates a^n (a raised to the power of n).
     * If n == 0 any number raised to the power of 0 is 1.
     * If n > 0 use the formula a^n = a * a^(n-1).
     * Time Complexity: O(n). n recursive calls.
     * @param a The base number.
     * @param n The exponent (natural number).
     * @return The result of raising a to the power of n.
     */
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}