package If_Statement;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char letter = word.charAt(word.length()-1);
        if (letter == 'A' || letter == 'a') {
            System.out.println("posiada");
        } else {
            System.out.println("nie");
        }
    }
}
