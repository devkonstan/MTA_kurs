package others;

import java.util.TreeSet;

public class ComparableTest {

    public static void main(String[] args) {

        new ComparableTest().doDziela();
    }

    public void doDziela() {
        Ksiazka b1 = new Ksiazka("Jak działają koty");
        Ksiazka b2 = new Ksiazka("Szukając Emo");
        Ksiazka b3 = new Ksiazka("Remiks organiczny");

        TreeSet<Ksiazka> tree = new TreeSet<Ksiazka>(); //sortuje alfabetycznie
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Ksiazka implements Comparable{
    String tytul;

    public Ksiazka(String t) {
        tytul = t;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tytul='" + tytul + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Ksiazka k = (Ksiazka) o;
        return (tytul.compareTo(k.tytul));
    }
}

