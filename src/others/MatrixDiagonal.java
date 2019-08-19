package others;

import java.util.Random;

class MatrixDiagonal {

    public void czytaj_dane(double[][] macierz, int rozmiar) {
        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if (i == j)
                    macierz[i][j] = Math.round(9 * (rand.nextDouble()));
                else
                    macierz[i][j] = 0;
            }
        }
    }

    public void przetworz_dane(double[][] macierz, int rozmiar) {
        double suma = 0;

        for (int i = 0; i < rozmiar; i++) {
            suma += macierz[i][i];
        }

        System.out.println("suma liczb na przekatnej wynosi: " + suma + ".");

        System.out.println();
    }


    public void wyswietl_wynik(double[][] macierz, int rozmiar) {

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                System.out.print(macierz[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {
        int rozmiar = 10;
        double[][] tablica = new double[rozmiar][rozmiar];

        MatrixDiagonal macierz = new MatrixDiagonal();

        macierz.czytaj_dane(tablica, rozmiar);
        macierz.przetworz_dane(tablica, rozmiar);
        macierz.wyswietl_wynik(tablica, rozmiar);
    }
}
