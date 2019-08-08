package If_Statement;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadż wiek");
        int age = scanner.nextInt();
        System.out.println("wprowadż płeć M lub K");
        String sex = scanner.next();
        if (sex.equalsIgnoreCase("M") && age >= 65) {
            System.out.println("Możesz pojść na emetyturę");
        } else if (sex.equalsIgnoreCase("K") && age >= 60) {
            System.out.println("Możesz pojść na emetyturę");
        } else {
            System.out.println("Nie możesz");

        /*if (sex.equalsIgnoreCase("m")) {
            if (age >= 65) {
                System.out.println("odpoczynek");
            } else {
                System.out.println("praca");
            }

        } else if (sex.equalsIgnoreCase("k")) {
            if (age >=60) {
                System.out.println("odpoczywaj");
            } else {
                System.out.println("pracuj kobietą");
            }
        } else {
            System.out.println("niepoprawne dane");*/
        }


    }
}
