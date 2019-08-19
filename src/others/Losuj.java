package others;

public class Losuj {
    public static void main(String[] args) {
//        teraz losowanie od 10 do 15
        double x = Math.random() * 5 + 10;
//        double x = 11;

        if (x > 14) {
            System.out.println("wieksza niż 14");
        } else if (x > 12) {
            System.out.println("większa niż 12");
        } else {
            System.out.println("mniejsza niż 12");
        }

        System.out.println("ot liczba");
        System.out.println(x);

    }
}
