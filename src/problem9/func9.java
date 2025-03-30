package problem9;

public class func9 {
    /**
     * Recursively calculates the binomial coefficient
     * Formula C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base Cases, if k == 0 or k == n return 1
     * @param n The total number of elements.
     * @param k The number of selected elements.
     * @return The binomial coefficient C(n, k).
     * Time Complexity: O(2^n) – exponential because each call branches into two recursive calls.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
