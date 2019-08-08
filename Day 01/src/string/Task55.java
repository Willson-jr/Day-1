package string;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        /*String part = word.substring(0,1);
        System.out.println(part.equalsIgnoreCase("w"));*/
        System.out.println(word.charAt(0)=='W');

    }
}
