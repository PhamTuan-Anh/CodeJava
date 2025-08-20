package Lec4ConditionalExecution;

import java.util.Scanner;

public class chiahetcho2 {

    public static void kiemtra(int x) {
        if (x % 2 == 0) {
            System.out.println("So chan!");
        }
        else {
            System.out.println("So le!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
       kiemtra(x);
    }
}
