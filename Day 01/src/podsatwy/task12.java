package podsatwy;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();

        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();

        int temp = secondNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("Liczbz 1 teraz "+ firstNumber+" .A drugie "+ secondNumber);

    }
}
