package others;

public class Warunki {
    public static void main(String[] args) {
        System.out.println("czesc");

        double x = Math.random() * 10;

        System.out.println("test 1");
        System.out.println(x);

        if (x > 6) {
            System.out.println("więcej niz 6");
        }

        if (x > 4) {
            System.out.println("więcej niz 4");
            return; //konczy dzialanie programu jesli warunek spelniony
        }

        System.out.println("koniec");
    }
}
