
package Lec4ConditionalExecution;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        if (side1 + side2 > side3 && 
            side1 + side3 > side2 && 
            side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("This is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }

        scanner.close();
    }
}