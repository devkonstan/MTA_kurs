package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectAreaMethods {
    double pole, a, b;

    void czytaj_dane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("obliczamy pole prostokata");
        System.out.println("podaj a");
        a = Double.parseDouble(br.readLine());
        System.out.println("podaj b");
        b = Double.parseDouble(br.readLine());
    }

    void przetworz_dane() {
        pole = a * b;
    }

    void wyswietl_wynik() {
        System.out.print("pole o boku a =");
        System.out.printf("%2.2f", a); //2 pola na liczbe a, w tym 2 po ","
        System.out.print(" oraz boku b =");
        System.out.printf("%2.2f", b);
        System.out.print(" wynosi ");
        System.out.printf("%2.2f.\n", pole);
    }

    public static void main(String[] args) throws IOException {
        RectAreaMethods pole_p = new RectAreaMethods();

        pole_p.czytaj_dane();
        pole_p.przetworz_dane();
        pole_p.wyswietl_wynik();

    }
}