package Lec4ConditionalExecution;

import java.util.Scanner;

public class returnanswer {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        double x = Scanner.nextDouble();
        System.out.println("Nhap y: ");
        double y = Scanner.nextDouble();
        System.out.println(quadrant(x, y));
    }

}
