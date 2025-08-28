
package Lec6_Arrays;
import java.util.Arrays;
public class ex13MergeTwoSortedArrays {
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) res[k++] = a[i++];
            else res[k++] = b[j++];
        }
        while(i<a.length) res[k++] = a[i++];
        while(j<b.length) res[k++] = b[j++];
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,4,6};
        int[] b = {2,3,5};
        System.out.println(Arrays.toString(mergeSortedArrays(a,b)));
    }
}
