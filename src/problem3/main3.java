package problem3;

import java.util.Scanner;

class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int n = scanner.nextInt();
        System.out.println(n + " is " + (func3.isPrime(n, n - 1) ? "Prime" : "Composite"));
    }
}

