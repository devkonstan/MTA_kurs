package others;

import java.io.IOException;

public class Exceptions {

    public static void cosWSrodku() throws IOException {
        throw new IOException("Nie ma nulla, ale co tam");
    }

    public static void robCos(String liczba, String liczba2) throws IOException {
        int x = Integer.parseInt(liczba.toLowerCase());
        int x2 = Integer.parseInt(liczba2.toLowerCase());

        int y = x + x2;
        System.out.println(y);

        try {
            cosWSrodku();
        } finally {
            System.out.println("KONIEC NIEBEZPIECZENSTWA");
        }

        System.out.println("KONIEC METODY");

    }

    public static void main(String[] args) {

        try {
            robCos("1", "2");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Blad " + e.getMessage());
        } finally {
            System.out.println("ZAWSZE TU TRAFI");
        }

        System.out.println("koniec programu");

    }
}
