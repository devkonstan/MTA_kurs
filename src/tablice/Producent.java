package tablice;


// klasa Producent ma stworzyć zadaną liczbę losowych liczb
// A) 1 - 100
// B) (z podanego zakresu)
public class Producent {

    public static int[] stworz(int ile) {
        return stworz(ile, 1, 100);
    }

    public static int[] stworz(int ile, int min, int max) {
        int[] res = new int[ile];

        for (int i = 0; i < res.length; i++) {
            res[i] = min + (int) (Math.random() * (max - min));
        }

        return res;
    }
}
