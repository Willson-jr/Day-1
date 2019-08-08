package podsatwy;

import java.util.Scanner;

public class task6   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2");
        int secondNumber = in.nextInt();
        double division = (double)firstNumber/secondNumber;
        System.out.println("Iloraz to " + division);

    }
}
