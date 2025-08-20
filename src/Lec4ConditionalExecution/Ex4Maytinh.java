package Lec4ConditionalExecution;

import java.util.Scanner;

public class Ex4Maytinh {

    public static double add(int number1, int number2) {
        return number1 + number2;
    }

    public static double sub(int number1, int number2) {
        return number1 - number2;
    }

    public static double avg(int number1, int number2) {
        return number1 * number2;
    }

    public static double div(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Khong the chia cho 0");
            return Double.NaN;
        }
        return (double) number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int number2 = scanner.nextInt();
        System.out.println("Nhap phep tinh +,-,*,/ ");
        String op = scanner.next();
        switch (op) {
            case "+":
                System.out.println("Ket qua: " + add(number1, number2));
                break;
            case "-":
                    
                System.out.println("Ket qua: " + sub(number1, number2));
                break;
            case "*":
                System.out.println("Ket qua: " + avg(number1, number2));
                break;
            case "/":
                System.out.println("Ket qua: " + div(number1, number2));
                break;
            default:
                System.out.println("Toan tu khong hop le!");

        }

    }
}
