package lab1.ex08;

import java.util.Scanner;

public class PowerCheck {

    static boolean checkNumber(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(checkNumber(n));
    }
}