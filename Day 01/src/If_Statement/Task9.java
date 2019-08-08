package If_Statement;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number");
        int first = scanner.nextInt();
        System.out.println("enter 2nd number");
        int second = scanner.nextInt();
        if ((first*second == 10) || (first+second == 10) || (first-second == 10)) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

    }
}
