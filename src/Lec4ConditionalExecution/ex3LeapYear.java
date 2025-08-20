
package Lec4ConditionalExecution;
import java.util.Scanner;
public class ex3LeapYear {
    public static void leapyear(int x){
            if ( x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
            {
                System.out.println("La nam nhuan!! ");
            }
            else{
                System.out.println("Deo phai la nam nhuan!!");
            }
    }
    public static void main ( String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nam: ");
        int x = scanner.nextInt();
        leapyear(x);
        
    }   
}
