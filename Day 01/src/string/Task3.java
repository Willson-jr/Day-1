package string;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        /*if (word.equals("Programowanie")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        } */

        System.out.println(word.equalsIgnoreCase("Programowanie"));
    }
}
