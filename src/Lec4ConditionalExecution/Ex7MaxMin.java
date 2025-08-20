
package Lec4ConditionalExecution;
import java.util.Scanner;
public class Ex7MaxMin {
    public static void Max(double number1,double number2, double number3){
        if (number1 >= number2 && number1 >= number3){
            System.out.println("Number 1 is the maximum number");
        }
        if (number2 >= number1 && number2 >= number3){
            System.out.println("Number 2 is the maximum number");
        }
        if (number3 >= number1 && number3 >= number2){
            System.out.println("Number 3 is the maximum number");
        }
    }
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number 1:");
            double number1=scanner.nextDouble();
            System.out.println("Enter number 2:");
            double number2=scanner.nextDouble();
            System.out.println("Enter number 3:");
            double number3=scanner.nextDouble();
            Max(number1,number2,number3);
            
    }
        
}
