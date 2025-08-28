
package Lec6_Arrays;
import java.util.Scanner;
public class ex10ConcatenateTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<n1;i++) a1[i]=sc.nextInt();
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<n2;i++) a2[i]=sc.nextInt();
        int[] res = new int[n1+n2];
        for(int i=0;i<n1;i++) res[i]=a1[i];
        for(int i=0;i<n2;i++) res[n1+i]=a2[i];
        for(int i=0;i<res.length;i++) System.out.print(res[i]+" ");
    }
}
