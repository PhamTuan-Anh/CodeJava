
package Lec6_Arrays;
import java.util.Scanner;
public class ex11FindtheSecondLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            } else if(arr[i]>second && arr[i]<max){
                second=arr[i];
            }
        }
        System.out.println("The second-largest element is: " + second);
    }
}
