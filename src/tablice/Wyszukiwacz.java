package tablice;


// A) podajemy jedną tablicę, zwraca tablicę zawierającą
// elemementy większe od zadanej wartości

// B) podajemy dwie tablice, zwraca tablicę zawierającą
// tylko elementy wspólne
public class Wyszukiwacz {

    private static int policzWiekszeNiz(int[] tabCala, int minimalnaWartosc) {
        int nowyRozmiar = 0;
        for (int i = 0; i < tabCala.length; i++) {
            if (tabCala[i] > minimalnaWartosc) {
                nowyRozmiar++;
            }
        }
        return nowyRozmiar;
    }

    public static int[] wyszukajWiekszeNiz(int[] tabCala, int minimalnaWartosc) {
        int[] tabPofiltrowana = new int[policzWiekszeNiz(tabCala, minimalnaWartosc)];
        int indexWyszukiwacza = 0;

        for (int i = 0; i < tabCala.length; i++) {
            if (tabCala[i] > minimalnaWartosc) {
                tabPofiltrowana[indexWyszukiwacza++] = tabCala[i];
            }
        }

        return tabPofiltrowana;
    }

    public static int[] wyszukajWspolne(int[] tab1, int[] tab2) {
        // w tablicy znalezione mają się znaleźć elementy z tab1, pod warunkiem, że są w tab2
        int[] znalezione = new int[tab1.length];
        int ileWspolnych = 0;

        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    ileWspolnych++;
                    System.out.println(tab1[i]);
                }
            }
        }
        System.out.println("liczba wspolnych liczb: " + ileWspolnych);
        return znalezione;
    }
}
