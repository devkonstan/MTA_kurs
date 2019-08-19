package warsztat;

public class Klucz {
    private static final double JEDEN_CAL = 2.5;
    private double rozmiar;

    //    private static final Klucz DZIESIATKA = new Klucz(10);
    private static final Klucz DZIESIATKA = new Klucz(10);
    private static Klucz TRZYNASTKA;
    private static final Klucz PIATKA = new Klucz(5);

    private Klucz(double rozmiar) {
        this.rozmiar = rozmiar;
        System.out.println("Tworzę klucz: " + rozmiar);
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public static Klucz podajKluczMetryczny(double rozmiarMetryczny) {
        if (rozmiarMetryczny == 13) {
            if (TRZYNASTKA == null)
                TRZYNASTKA = new Klucz(13);
            return TRZYNASTKA;
        } else if (rozmiarMetryczny == 10)
            return DZIESIATKA;
        else if (rozmiarMetryczny == 5)
            return PIATKA;
        else
            return new Klucz(rozmiarMetryczny);
    }

    public static Klucz podajKluczWCalach(double rozmiarWCalach) {
        return podajKluczMetryczny(rozmiarWCalach * JEDEN_CAL);
    }

    public static void uzywamKlucze() {
        System.out.println("będę używał klucze");
    }


}
