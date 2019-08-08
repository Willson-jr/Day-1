package If_Statement;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe 1");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadz liczbe 2");
        int secondNumber = scanner.nextInt();
        if (firstNumber == 6 || secondNumber == 6) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
