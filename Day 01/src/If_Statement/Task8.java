package If_Statement;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.endsWith("a")) {
            System.out.println("kobieta");
        } else {
            System.out.println("męzczyzna");
        }
    }
}
