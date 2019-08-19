package others;

// dopisac ile poradnik udzielil porad na koncu
// dodac licznik porad w petli
public class zadanko {
    public static void main(String[] args) {
        //double wiek = Math.random() * 90 + 10;
        //double waga = Math.random() * 50 + 100;
        //double wzrost = Math.random() * 50 + 150;

        double wiek = 105;
        double waga = 129;
        double wzrost = 206;

        int licznik = 0;
        System.out.println("wiek: " + wiek);
        System.out.println("waga: " + waga);
        System.out.println("wzrost: " + wzrost);

        //warunek 1
        if (wzrost > 300 || waga > 150) {
            System.out.println("jestes ogromny, to praktycznie niemozliwe");
            licznik = licznik + 1;
            return; // nie zliczamy rad, bo to warunek wyjatkowy
        }

        //warunek 2
        if (wiek > 100) {
            System.out.println("duzo przezyles, wiec nie bede ci trul d***");
            licznik = licznik + 1;
            return; // nie zliczamy rad, bo to warunek wyjatkowy
        }

        //warunek 3
        if (wiek < 18) {
            System.out.println("jestes niepelnoletni, wiec te porade trzeba skonsultowac");
            licznik = licznik + 1;
        }

        //warunek 4
        if (wiek == 10 && waga > 100) {
            System.out.println("musisz uwazac maly grubasku");
            licznik = licznik + 1;
        }

        //warunek 5
        if (wiek > 10 && waga < 40 && wzrost > 100) {
            System.out.println("prawdopodobnie jestes anorektykiem");
            licznik = licznik + 1;
        }

        //warunek 6
        if (waga > 100) {
            {
                if (wzrost > 200) {
                    System.out.println("jestes \"wielkoludem\"");
                } else if (wzrost < 200 && wzrost > 185)
                    System.out.println("musisz uwazac na swoja wage");
                else
                    System.out.println("zdecydowanie schudnij");
            }
            licznik = licznik + 1;
        }


        System.out.print("udzielono " + licznik);
        System.out.println(" porad");

    }
}

