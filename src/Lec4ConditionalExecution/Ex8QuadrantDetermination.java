
package Lec4ConditionalExecution;
import java.util.Scanner;
public class Ex8QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("The point is in Quadrant 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in Quadrant 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in Quadrant 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in Quadrant 4.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the Origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the Y axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X axis.");
        }
    }
}
