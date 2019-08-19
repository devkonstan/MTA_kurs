package others;

public class BubbleSort { //babelkowe w porzadku rosnacym
    public static void main(String[] args) {
        int[] liczby = new int[6]; //6 liczb w tablicy
        int x, j;

        liczby[0] = 532;
        liczby[1] = 24;
        liczby[2] = 13;
        liczby[3] = 91;
        liczby[4] = 2;
        liczby[5] = 981;

        System.out.println("dla liczb: ");
        //System.out.println(liczby.length);
        for (int i = 0; i < liczby.length; i++)
            if (i < liczby.length-1)
                System.out.print(liczby[i] + ", "); //sprawdza czy ilosc liczb w szyku jest mniejsza niz w liscie pocz
            else
                System.out.print(liczby[i] + "."); //jesli rowna ilosci liczb to stawia kropke
        // i zaczyna liczyc od 1, bo porownuje wartosc z poprzednia z listy, a dla 0 nie ma poprzedniej

        for (int i = 1; i < liczby.length; i++) //sortowanie babelkowe
        {       //j=5(ilosc liczb - 1 w tablicy, bo ostatniego elementu nie trzeba juz porownywac z zadnym
            for (j = liczby.length - 1; j >= i; j--)
                if (liczby[j - 1] > liczby[j]) //porownujemy liczbe z jej nastepnikiem w szyku i zamieniamy jesli spelni war.
                {
                    x = liczby[j - 1]; //tymczasowa zmienna buforowa x
                    liczby[j - 1] = liczby[j]; //podmianka
                    liczby[j] = x; //przypisanie zbuforowanej liczby do nastepnika w petli
                }
        }
        System.out.println("");
        System.out.println("liczby uporzadkowane to: ");

        for (int i = 0; i < liczby.length; i++)
            if (i < liczby.length - 1)
                System.out.print(liczby[i] + ", ");
            else
                System.out.print(liczby[i] + ".");
    }
}

