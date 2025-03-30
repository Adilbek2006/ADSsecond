package problem10;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + func10.gcd(a, b));
    }
}
