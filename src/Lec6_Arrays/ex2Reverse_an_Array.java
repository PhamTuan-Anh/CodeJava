package Lec6_Arrays;
import java.util.Scanner;
public class ex2Reverse_an_Array {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n/2;i++){
            int tmp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=tmp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


  

