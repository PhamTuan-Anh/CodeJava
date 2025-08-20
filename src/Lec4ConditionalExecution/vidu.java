package Lec4ConditionalExecution;

import java.util.Scanner;

public class vidu {

    public static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);
        int x = 42;
        int y = 17;
        int z = 25;
        if (y < x && y <= z) {
            System.out.println("true");

        } else {
            System.out.println("False");
        }
        if (y % 2 == y % 2 || x % 2 == z % 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (x <= y + z && x >= y + z) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if ((x + y) % 2 == 0 || !((z - y) % 2 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
