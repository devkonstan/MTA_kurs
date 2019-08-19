package others;

public class PrimeFinder implements Runnable { //interfejs Runnable pozwala uruchomic klase jako watek
    public long target; //max wartosc, do ktorej analizujemy liczby pierwsze np 5000
    public long prime; //przechowuje wartosc znalezionej liczby pierwszej
    public boolean finished = false; //wskazuje, czy osgiagnieto cel
    private Thread runner; //zmienna egzemplarza przechowujaca obiekt Thread wykorzystywany do uruchomienia watku/domyslnie null

    PrimeFinder(long inTarget) { //konstruktor metody
        target = inTarget; //zmienna egzemplarza target
        if (runner == null) {
            runner = new Thread(this); //uruchomienie watku
            runner.start(); //wywolanie metody start
        }
    }

    public void run() {
        long numPrimes = 0; //liczba znalezionych do teraz liczb pierwszych
        long candidate = 2; //liczba kandydat na liczbe pierwsza; 2 - najnizsza mozliwa
        while (numPrimes < target) {
            if (isPrime(candidate)) { //metoda sprawdza, czy candidate jest liczba pierwsza
                numPrimes++; //jesli jest pierwsza, to inkrementuje ilosc liczb pierwszych
                prime = candidate; //zmienna otrzymuje wartosc = liczbie pierwszej
            }
            candidate++;
        }
        finished = true;
    }

    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % 1 == 0)
                return false;
        }
        return true;
    }

}
