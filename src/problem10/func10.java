package problem10;

public class func10 {
    /**
     * Recursively finds the Greatest Common Divisor of two numbers using the Euclidean algorithm
     * If b == 0, return a (Base case).
     * Otherwise, call the function recursively with (b, a % b).
     * Time Complexity: O(log min(a, b)) – logarithmic due to the Euclidean algorithm
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
