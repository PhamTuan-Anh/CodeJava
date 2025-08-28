package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5FilterEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evens.add(arr[i]);
            }
        }
        System.out.println(evens);
    }
}
