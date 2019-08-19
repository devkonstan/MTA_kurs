package others;

public class EvenNotEvenSum {
    public static void main(String[] args) {
        int n = 10;
        int suma_p = 0;
        int suma_np = 0;
        int[] dane = new int[n];

        for (int i = 1; i <= dane.length-1; i++) {
            dane[i] = i;
            System.out.println(dane[i]);
        }

        for (int x : dane) {
            if ((x % 2) == 0)
                suma_p += x; //sumowanie liczb parzystych
            else
                suma_np += x;
        }

        System.out.println("suma p wynosi " + suma_p);
        System.out.println("suma np zaś " + suma_np);
    }
}
