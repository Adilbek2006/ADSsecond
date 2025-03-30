package problem1;

class func {
    /**
     * This method finds the minimum element in an array.
     * It iterates through all elements once, making its time complexity O(n).
     *
     * @param arr The array of numbers.
     * @return The minimum number in the array.
     */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
