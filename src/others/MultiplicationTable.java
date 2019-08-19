package others;

public class MultiplicationTable {

    public static void main(String[] args) {

        int n = 10, wiersze, kolumny;
        wiersze = 1;

        do {
            kolumny = 1;
            do {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            while (kolumny <= n);
            wiersze++; //program wpada tutaj gdy kolumny = 11 i iteruje wiersze od 1
            System.out.println();
        }
        while (wiersze <= n);
    }
}
