package problem2;

class func2 {
    /**
     * This method calculates the average of an array.
     * Time complexity: O(n) because it sums all elements once.
     * @param arr The array of numbers.
     * @return The average value of the array.
     */
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return (double) sum / arr.length;
    }
}