package lab1.ex07;

import java.util.Scanner;

public class IncreasingNumber {

    static boolean checkNumber(int n) {
        int prev = 10;

        while (n > 0) {
            int digit = n % 10;
            if (digit > prev)
                return false;
            prev = digit;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(checkNumber(n));
    }
}