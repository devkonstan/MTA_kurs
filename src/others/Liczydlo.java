package others;

public class Liczydlo {

    static int sum(int x, int y) {
        int res = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("wynik = " + res);
        return res;
    }

    public static void main(String[] args) {

        boolean warunek1 = sum(1, 12) < 10;
        boolean warunek2 = sum(10, 15) > 100;

        if (warunek1 || warunek2) {
            System.out.println("Bardzo dobrze");
        } else {
            System.out.println("Słabo");
        }

    }
}
