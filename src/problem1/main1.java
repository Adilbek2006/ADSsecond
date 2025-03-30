package problem1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("min: " + func.findMin(arr));
    }
}