package problem9;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("values for n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + func9.binomialCoefficient(n, k));
    }
}
