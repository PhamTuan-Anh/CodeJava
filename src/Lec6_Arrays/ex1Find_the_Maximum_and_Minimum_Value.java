package Lec6_Arrays;
import java.util.Scanner;

public class ex1Find_the_Maximum_and_Minimum_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("The maximum value is: " + max + ", The minimum value is: " + min);
    }
}