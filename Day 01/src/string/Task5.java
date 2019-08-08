package string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String first = name.substring(0,1);
        String secong = name.substring(1);
        System.out.println(first.toUpperCase()+secong.toLowerCase());
    }
}
