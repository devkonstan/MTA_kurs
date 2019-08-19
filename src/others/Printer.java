package others;

class Printer {
    int x = 1;
    int y = 0;

    void printMe() {
        System.out.println(x + y);
        System.out.println(this.getClass().getName());
    }
}

class SubPrinter extends Printer {
    int z = 3;

    void printMe() { //przeslonienie metody printMe() -> dodanie zmiennej z
        System.out.println(x + y + z);
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter obj = new SubPrinter();
        obj.printMe(); //obiekt przerobione.SubPrinter nie posiada metody o tej nazwie wiec Java przechodzi do klasy nadrzednej
    }
}