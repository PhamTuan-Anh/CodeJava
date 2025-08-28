package Lec6_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4ToDoistManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                String task = sc.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                System.out.println(tasks);
            } else if (choice == 3) {
                int index = sc.nextInt();
                if (index >= 0 && index < tasks.size()) {
                    tasks.remove(index);
                }
            } else {
                break;
            }
        }
    }
}
