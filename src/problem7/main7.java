package problem7;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("reversed order:");
        func7.printReverse(n - 1, numbers);
    }
}

