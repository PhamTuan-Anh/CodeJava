
package Lec6_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ex8SortandSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){ index=i; break; }
        }
        if(index!=-1) System.out.println("The number " + x + " was found at index " + index);
        else System.out.println("Not found");
    }
}
