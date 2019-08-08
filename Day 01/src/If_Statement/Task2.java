package If_Statement;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        /* boolean info = true;
        int div3 = number%3;
        int div5 = number%5;
        if (div3 !=0 || div5 !=0) {
            System.out.println("niepodzielna");
        } else {
            System.out.println("podzielna");
            */
        System.out.println(((number%3 == 0) || (number%5 == 0)) ? "podzielna" : "niepodzielna" );
        }
    }

