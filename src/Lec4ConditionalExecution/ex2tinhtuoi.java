package Lec4ConditionalExecution;

import java.util.Scanner;

public class ex2tinhtuoi {

    public static void nhaptuoi(int x) {
        if (x < 12) {
            System.out.println("Tre em");
        }
        if (x < 19 && x > 13) {
            System.out.println("Thieu nien");
        }
        if (x < 59 && x > 20) {
            System.out.println("Nguoi lon");
        }
        if (x > 60) {
            System.out.println("Nguoi gia");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        nhaptuoi(x);
    }
}
