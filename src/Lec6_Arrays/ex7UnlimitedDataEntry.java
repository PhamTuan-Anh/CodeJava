
package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ex7UnlimitedDataEntry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int x = sc.nextInt();
            if(x==-1) break;
            list.add(x);
        }
        int sum=0;
        for(int i:list) sum+=i;
        System.out.println("Numbers entered: " + list + ", The sum is: " + sum);
    }
}
