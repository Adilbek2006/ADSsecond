package problem7;

public class func7 {
    /**
     * Recursively prints the elements of an array in reverse order
     * Starts from the last element and moves to the first
     * Base case, if the index is negative, stop the recursion.
     * Recursive case, print the current element, then call the function for the previous index
     * Time Complexity: O(n) – one recursive call per element
     * @param index The current index in the array
     * @param numbers The array of numbers to print in reverse order
     */
    public static void printReverse(int index, int[] numbers) {
        if (index < 0) return;
        System.out.print(numbers[index] + " ");
        printReverse(index - 1, numbers);
    }
}

