package others;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(multiple(2, 2));
        System.out.println(substract(10, 2));
        System.out.println(divide(4, 2));
        System.out.println(calculate(4, 2, "+"));
        System.out.println(calculate(4, 2, "print  +"));
        calculate(4, 2, "  PRINT +");
        calculate(4, 2, " razy dwa ");
        System.out.println(add(1, 2, 3));

    }

    static int calculate(int x, int y, String operacja) {
        boolean czyPrint = false;

        operacja = operacja.trim();

        if(operacja.toLowerCase().startsWith("print")) {
            czyPrint = true;
            operacja = operacja.substring(6);
        }
        int wynik;
        operacja = operacja.trim();

        if(operacja.equals("+") || operacja.equalsIgnoreCase("plus") ) {
            wynik = add(x, y);
        } else if(operacja.equals("-") || operacja.equalsIgnoreCase("minus") ) {
            wynik = substract(x, y);
        } else if(operacja.equals("*")) {
            wynik = multiple(x, y);
        } else if(operacja.equals("/")) {
            wynik = divide(x, y);
        } else {
            System.out.println("Nie znam takiej operacji: '" + operacja + "'");
            wynik = 0;
        }

        if(czyPrint) {
            System.out.println(x + " " + operacja + " " + y + " = " + wynik);
        }

        return wynik;
    }

    static int add(int x1, int x2, int x3) { return x1 + x2 + x3;}
    static int add(int x, int y) { return x + y; }
    static int multiple(int x, int y) { return x * y; }
    static int substract(int x, int y) { return x - y; }
    static int divide(int x, int y) { return x / y; }

}
