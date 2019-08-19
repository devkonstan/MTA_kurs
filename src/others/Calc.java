package others;

public class Calc {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(multiple(2, 2));
        System.out.println(substract(10, 2));
        System.out.println(divide(4, 2));
        System.out.println(calculate(4, 2, "+")); //String s=operacja
        System.out.println(calculate(4, 2, "plus"));
        System.out.println(calculate(4, 2, "minus"));
        System.out.println(calculate(4, 2, "minusik"));

        System.out.println("************");

        calculate(4, 2, "print +");
        calculate(4, 2, "print -");
        calculate(4, 2, "razy *");
        //napisac metode ktora w zaleznosci od operacji robi konkretna operacje
        System.out.println(add(1, 2, 3));
    }

    private static int calculate(int i, int j, String s) {
        boolean czyPrint = false;
        if (s.startsWith("print")) { //rownie dobrze s.contains
            czyPrint = true;
            s = s.substring(6); // wycina 7 znak w Stringu
        }

        int wynik;
        if (s.equals("+") || s.equalsIgnoreCase("plus")) {
            wynik = add(i, j);
        } else if (s.equals("-") || s.equalsIgnoreCase("minus")) {
            wynik = substract(i, j);
        } else if (s.equals("*") || s.equalsIgnoreCase("multiple")) {
            wynik = multiple(i, j);
        } else {
            System.out.println("nie znam takiej operacji:" + s);
            wynik = 0;
        }

        if (czyPrint) {
            System.out.println(i + " " + s + " " + j + " " + " = " + wynik);
        }
        return wynik;
    }

    private static int divide(int i, int j) {
        return i / j;
    }

    private static int substract(int i, int j) {
        return i - j;
    }

    private static int multiple(int i, int j) {
        return i * j;
    }

    private static int add(int i, int j) {
        return i + j;
    }

    private static int add(int i, int j, int k) {
        return i + j + k;
    }
}
