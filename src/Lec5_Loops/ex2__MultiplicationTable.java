
package Lec5_Loops;
import java.util.Scanner;
public class ex2__MultiplicationTable {
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Int Number 2 to 9: ");
        int number = scanner.nextInt();
        for (int i = 1 ; i <= 10; i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
        
      }
}