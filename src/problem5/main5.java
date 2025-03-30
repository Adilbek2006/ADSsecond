package problem5;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + func5.fibonacci(n));
    }
}