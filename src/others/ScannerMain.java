package others;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię ");
        String imie = scanner.next();
        System.out.print("Witaj " + imie);

        System.out.println();

        System.out.println("podaj liczbę numer 1: ");
        int x1 = scanner.nextInt();

        System.out.println("podaj liczbę numer 2: ");
        int x2 = scanner.nextInt();

        System.out.print("wynik mnożenia to: ");
        System.out.println(x1 * x2);


    }
}
