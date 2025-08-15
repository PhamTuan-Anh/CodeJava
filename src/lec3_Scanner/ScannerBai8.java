package lec3_Scanner;
import java.util.Scanner;
public class ScannerBai8 {
    public static void main (String args[]){
        Scanner input= new Scanner(System.in);
         System.out.println("Enter:");
         String name = input.nextLine();
        Scanner conkhi=new Scanner(name);
        while(conkhi.hasNext()){
            String huhu = conkhi.next();
            System.out.println(huhu);
        }      
    }
}
