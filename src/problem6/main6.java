package problem6;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number and degree: ");
        int a = scanner.nextInt(), n = scanner.nextInt();
        System.out.println(a + "^" + n + " = " + func6.power(a, n));
    }
}