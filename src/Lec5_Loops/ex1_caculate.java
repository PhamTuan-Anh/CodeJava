
package Lec5_Loops;
import java.util.Scanner;
public class ex1_caculate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number= scanner.nextInt();
        int sum=0;
        for (int i=1; i<= number; i++){
            sum+=i;
        }
        System.out.println(" Calculate the Sum of Numbers from 1 to "+number+" is: "+sum);
    }
}