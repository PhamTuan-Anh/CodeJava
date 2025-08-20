
package Lec4ConditionalExecution;
import java.util.Scanner;
public class Ex9AbsoluteValue {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int absValue = (number >= 0) ? number : -number;
        System.out.println("The absolute value is " + absValue);
    }
}
