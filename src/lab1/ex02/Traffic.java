package lab1.ex02;

import java.util.Scanner;

public class Traffic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Red  2.Yellow  3.Green");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("STOP");
                break;
            case 2:
                System.out.println("READY");
                break;
            case 3:
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid Input");
        sc.close();
        }
    }
}