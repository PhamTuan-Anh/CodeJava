
package Lec4ConditionalExecution;
import java.util.Scanner;
public class Ex6Academic {
    public static void Academic(double point){
        if(point>9 && point < 10){
            System.out.println("Excellent");
        }
        if( point >=8 && point <=8.9){
            System.out.println("Good");
        }
        if(point >=6.5 && point <=7.9){
            System.out.println("Fair");
        }
        if (point >=5 && point <=6.4){
            System.out.println("Average");
        }
        if ( point <5 ){
            System.out.println("Fail");
        }
        else{
            System.out.println("Please enter the correct score.");
        }
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your point( 1 -> 10):" );
        double point = scanner.nextDouble();
        Academic(point);
        }         
}
