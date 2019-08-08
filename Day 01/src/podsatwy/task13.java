package podsatwy;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();

        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();

        System.out.println("Podaj liczbe 3");
        int thirdNumber = in.nextInt();

        System.out.println("Podaj liczbe 4");
        int fourthNumber = in.nextInt();

        double average = ((double)firstNumber+secondNumber+thirdNumber+fourthNumber)/4.000;
        System.out.println(String.format("%.3f",average));
    }
}
