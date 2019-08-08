package podsatwy;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj stronę 1");
        int firstSide = in.nextInt();
        System.out.println("Podaj stronę 2");
        int secondSide = in.nextInt();
        System.out.println("podaj wysokość");
        int height = in.nextInt();
        double pole = (((double)firstSide+secondSide)*height)/2;
        System.out.println(pole);
    }
}
