
package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class ex15ConvertBetweenArrayandArrayList {

    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        String[] arr = new String[list.size()];
        return list.toArray(arr);
    }

    public static void main(String[] args) {
        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list1 = arrayToArrayList(arr);
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Charles", "David"));
        String[] arr2 = arrayListToArray(list2);
        System.out.println(Arrays.toString(arr2));
    }
}