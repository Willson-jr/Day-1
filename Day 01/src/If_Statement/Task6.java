package If_Statement;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //System.out.println( number%11 == 0 ? "jest" : "nie");
        if (number%11 == 0) {
            System.out.println("tak");
        } else {
            System.out.println( "nie");
        }
    }
}
