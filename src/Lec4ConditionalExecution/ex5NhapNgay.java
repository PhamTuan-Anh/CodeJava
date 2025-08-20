
package Lec4ConditionalExecution;
import java.util.Scanner;
public class ex5NhapNgay {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tu 1 den 7: ");
        int n = scanner.nextInt();
        switch(n){
            case 7: System.out.println("Saturday"); break;
            case 6: System.out.println("Friday"); break;
            case 5: System.out.println("Thirday"); break;
            case 4: System.out.println("WenedDay"); break;
            case 3: System.out.println("Tuesday"); break;
            case 2: System.out.println("Monday"); break;
            case 1: System.out.println("Sunday"); break;
            default :System.out.println("N/A \n");
        }
    }    
}
