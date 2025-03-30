package problem4;

import java.util.Scanner;

class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + func4.factorial(n));
    }
}