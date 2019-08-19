package warsztat;

public class Majster {

    public static void main(String[] args) {

        System.out.println("START");

        Klucz.uzywamKlucze();

        System.out.println("BIORĘ KLUCZE");

        Klucz k1 = Klucz.podajKluczWCalach(3);
        Klucz k2 = Klucz.podajKluczMetryczny(13);
        Klucz k3 = Klucz.podajKluczMetryczny(10);
        Klucz k4 = Klucz.podajKluczMetryczny(13);
        Klucz k5 = Klucz.podajKluczWCalach(3);


        Klucz.podajKluczMetryczny(5);
        Klucz.podajKluczMetryczny(5);
        Klucz.podajKluczMetryczny(5);
        Klucz.podajKluczMetryczny(5);
        Klucz.podajKluczWCalach(2);
        Klucz.podajKluczWCalach(2);
        Klucz.podajKluczMetryczny(13);
        Klucz.podajKluczMetryczny(198);
        Klucz.podajKluczMetryczny(10);

    }
}
