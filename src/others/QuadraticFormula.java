package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QuadraticFormula {

    double a, b, c, delta, x1, x2;
    char liczba_pierw;

    void czytaj_dane()
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("obliczamy pierwiastki rownania [] dla dow a, b, c.");
        System.out.println("podaj a");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("niedozwolona wartosc a");
            System.exit(1); //wychodzimy z programu
        } else {
            System.out.println("podaj b");
            b = Double.parseDouble(br.readLine());
            System.out.println("podaj c");
            c = Double.parseDouble(br.readLine());
        }
    }

    void przetworz_dane() {
        delta = b * b - 4 * a * c;

        if (delta < 0) liczba_pierw = 0;
        if (delta == 0) liczba_pierw = 1;
        if (delta > 0) liczba_pierw = 2;

        switch (liczba_pierw) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }
    }

    void wyswietl_wynik() {
        System.out.println("dla liczb");
        System.out.printf("a= " + "%2.2f,", a);
        System.out.printf("b= " + "%2.2f,", b);
        System.out.printf("c= " + "%2.2f,", c);

        switch (liczba_pierw) {
            case 0:
                System.out.print("brak pierw rzecz dla a=0\n");
                break;
            case 1:
                System.out.printf(" trojmian ma 1 pierw podwojny x1=%2.2f\n", x1);
                break;
            case 2: {
                System.out.print(" trojmian ma 2 pierw: ");
                System.out.printf("x1=%2.2f", x1);
                System.out.printf("oraz x2=%2.2f", x2);
            }
            break;
        }
    }

    public static void main(String[] args)
            throws IOException {
        QuadraticFormula tr1 = new QuadraticFormula();

        tr1.czytaj_dane();
        tr1.przetworz_dane();
        tr1.wyswietl_wynik();
    }
}

