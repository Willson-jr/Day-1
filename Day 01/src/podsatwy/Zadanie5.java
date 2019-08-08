package podsatwy;

import java.util.Scanner;

public class Zadanie5 {

        //psvm
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //sout
        System.out.println("Wprowadz liczbe 1");
        int firstNumber = in.nextInt();
        //int number1 = Integer.parseInt(input.nextLine());
        System.out.println("Wprowadz liczbe 2");
        int secondNumber = in.nextInt();
        //int number2 = Integer.parseInt(input.nextLine());
        double average = (firstNumber+secondNumber)/2.0 ;
        System.out.println("Sriednia liczb to " + average);

        /*
        KONWERSJA JAWNA:
        double my = 2.15;
        int number = (int) my;
        KONWERSJA NIEJAWNA:
        int number = 5;
        double myNuber = number;
        ROZSZERZA typ mniejszy do większego
        int ----> double

        */

    }
}
