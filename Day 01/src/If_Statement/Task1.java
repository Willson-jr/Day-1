package If_Statement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        /*boolean info = false;
        if (number >1000) {
            info = true;
        }
        System.out.println(info);
        */
        System.out.println(number>1000 ? "Większa od 1000" : "Mniejsza on 1000");
    }
}
