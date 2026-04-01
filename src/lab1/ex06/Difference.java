package lab1.ex06;

import java.util.Scanner;

public class Difference {

    static int calculateDifference(int n) {
        int sum = 0, squareSum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            squareSum += i * i;
        }

        return squareSum - (sum * sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(calculateDifference(n));
    }
}