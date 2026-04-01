package lab1.ex03;

import java.util.Scanner;

public class Fibonacci {

    static int fib1(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int fib2(int n) {
        if (n <= 1) return 1;
        return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(fib1(n));
        System.out.println(fib2(n));
    }
}