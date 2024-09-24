package CodeChef;

import java.util.Scanner;

public class KthCharater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("enter the size");
        size = scanner.nextInt();
        scanner.nextLine();
        int kthEkement;
        System.out.println("enter kth element");
        kthEkement = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("entre the char");
            String input = scanner.nextLine();
            array[i] = input;
        }
        String result = String.join("", array);
        StringBuilder stringBuilder = new StringBuilder(result);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        for (int i = result.length() - 1; i >= 0; i--) {
            stringBuilder.append(result.charAt(i));
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.charAt(kthEkement - 1));

    }
}
