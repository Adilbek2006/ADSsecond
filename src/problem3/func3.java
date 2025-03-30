package problem3;

class func3 {
    /**
     * This method checks if a number is prime using recursion.
     * Time complexity: O(sqrt(n)), since we only check divisibility up to sqrt(n).
     * @param n The number to check.
     * @param divisor The current divisor being tested.
     * @return True if prime, false otherwise.
     */
    public static boolean isPrime(int n, int divisor) {
        if (n < 2){
            return false;
        }
        if (divisor == 1){
            return true;
        }
        return (n % divisor != 0) && isPrime(n, divisor - 1);
    }
}
