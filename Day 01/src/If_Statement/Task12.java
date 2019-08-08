package If_Statement;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String code = "1/100";
        String code = scanner.next();
        if (code.indexOf("/") == -1) {
            System.out.println("nie");
        } else {
            int indexSlash = code.indexOf("/");
            String first = code.substring(0, indexSlash);
            String last = code.substring(indexSlash + 1);
            int firstNumber = Integer.parseInt(first);
            int lastNumber = Integer.parseInt(last);
            if (lastNumber == 100 && firstNumber > 0 && firstNumber <=100 )  {
                System.out.println("correct");
            } else {
                System.out.println("nie");
            }

        }

    }
}
