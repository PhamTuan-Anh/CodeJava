
package Lec6_Arrays;
import java.util.Scanner;
public class ex9SwapTwoElementsinanArray {

    public static void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int i1=sc.nextInt(), i2=sc.nextInt();
        swap(arr,i1,i2);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
