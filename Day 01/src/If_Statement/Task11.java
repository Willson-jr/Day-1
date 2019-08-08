package If_Statement;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cover = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                cover++;
            }
        }
        if (cover == 4 ) {
            System.out.println("only 4");
        } else {
            System.out.println("no");
        }
    }
}
