
package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ex7RemoveDuplicateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(sc.nextInt());
        ArrayList<Integer> result = new ArrayList<>();
        for(int x:arr){
            if(!result.contains(x)) result.add(x);
        }
        System.out.println(result);
    }
}
