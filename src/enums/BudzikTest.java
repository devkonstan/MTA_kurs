package enums;

public class BudzikTest {

    public static void main(String[] args) {
        Budzik budzik = new Budzik();

        Dzien[] dni = {Dzien.PON, Dzien.WT, Dzien.SR, Dzien.CZW, Dzien.PIAT, Dzien.SOB, Dzien.NIEDZ};
        int[] spodziewaneGodzinyObudzenia = {7, 13, 7, 7, 7, 10, 10};

        for (int i = 0; i < dni.length; i++) {
            Dzien dzien = dni[i];
            int spodziewanaPobudka = spodziewaneGodzinyObudzenia[i];

            int pobudkaKtoraWskazalBudzik = budzik.obudzMnie(dzien);

            if (pobudkaKtoraWskazalBudzik != spodziewanaPobudka) {
                System.out.println("Niepoprawna pobudka ! " + pobudkaKtoraWskazalBudzik);
                System.out.println("Dnia " + dzien + " powinna być o " + spodziewanaPobudka);
            }

        }


    }
}
