package others;

import java.util.Arrays;
import java.util.Random;

public class MinMaxFind {
    public static void main(String[] args) {

        int i;
        double min, max;
        Random r = new Random();

        double[] tab = new double[5];

        for (i = 0; i <= tab.length - 1; i++) {
            tab[i] = Math.round(100 * (r.nextDouble())); //nextDouble zwraca z przedzialu (0,1)
            System.out.println(tab[i]);

        }
        Arrays.sort(tab);

        min = tab[0];
        max = tab[tab.length - 1];

        System.out.println("max wartosc to: " + max);
        System.out.println("min wartosc to: " + min);

    }
}

