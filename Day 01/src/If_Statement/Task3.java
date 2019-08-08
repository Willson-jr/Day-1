package If_Statement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean info = false;
        if (text.equals("Akademia kodu")){
            System.out.println("Hasło poprawne");
        } else {
            System.out.println("nie poprawne");
        }



        //System.out.println(text.equals("Akademia kodu") ? "True" : "False");
    }
}
