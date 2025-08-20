
package Lec4ConditionalExecution;
import java.util.Scanner;
public class lambreak {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        switch(n){
            case 5: System.out.println("Five \n"); break;
            case 4: System.out.println("Four \n"); break;
            case 3: System.out.println("Three \n"); break;
            case 2: System.out.println("Two \n"); break;
            case 1: System.out.println("One \n"); break;
            default :System.out.println("N/A \n");
        }
    }    
}
