package If_Statement;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz dzien");
        String day = scanner.next();
        if (day.equalsIgnoreCase("sobota") || day.equalsIgnoreCase("niedziela")) {
            System.out.println("10:00");
        } else {
            System.out.println("07:00");
        }
    }
}
