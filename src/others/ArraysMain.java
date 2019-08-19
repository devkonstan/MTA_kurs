package others;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {

        int [] tab = new int [] {1, 2, 3};

        for (int x : tab) {
            System.out.println(x);
        }

        int [] tab2 = new int[3];
        for (int x : tab2) {
            System.out.println(x);
        }

        int [][] tab2D = new int[3][2];

        int numer = 0;

        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                tab2D[i][j] = numer++;
            }
            numer += 100;
        }

        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                int x = tab2D[i][j];
                System.out.println(String.format("a[%d][%d]=%d", i, j, x));
            }
        }

        System.out.println("*********");

        for (int i = 0; i < tab2D.length; i++) {
            System.out.println(Arrays.toString(tab2D[i]));
        }

        System.out.println("*********");

        int [][] tab2D_Dziwna = new int[3][];

        int rozmiar = 4;

        for (int i = 0; i < tab2D_Dziwna.length; i++) {
            tab2D_Dziwna[i] = new int[rozmiar++];
        }

        for (int i = 0; i < tab2D_Dziwna.length; i++) {
            for (int j = 0; j < tab2D_Dziwna[i].length; j++) {
                tab2D_Dziwna[i][j] = numer++;
            }
        }


        for (int i = 0; i < tab2D_Dziwna.length; i++) {
            System.out.println(Arrays.toString(tab2D_Dziwna[i]));
        }

        System.out.println(tab2D_Dziwna[0][2]);
        System.out.println(tab2D_Dziwna[1][2]);
        System.out.println(tab2D_Dziwna[2][4]);

    }
}
