package others;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortedUnsorted {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(); //obiekt klasy ArrayList

        lista.add(20);
        lista.add(53);
        lista.add(123);
        lista.add(313);
        lista.add(91);
        lista.add(15);

        System.out.println("elementy nieposortowane");

        for (int i = 0; i < lista.size(); i++) {
            if (i < lista.size() - 1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ".");
        }

        System.out.println();
        Collections.sort(lista); //sortowanie listy

        System.out.println("elementy posortowane");

        for (int i = 0; i < lista.size(); i++) {
            if (i < lista.size() - 1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ".");
        }

        System.out.println();
                lista.remove(4);
                lista.add(1,4);

        System.out.println("elementy nieposortowane po usunieciu i dodaniu");

        for (int i = 0; i < lista.size(); i++) {
            if(i<lista.size()-1)
                System.out.print(lista.get(i)+", ");
            else
                System.out.print(lista.get(i)+".");
        }


        Collections.sort(lista);
        System.out.println();
        System.out.println("ponowne sortowanie listy");

        for (int i = 0; i < lista.size(); i++) {
            if (i < lista.size() - 1)
                System.out.print(lista.get(i) + ", ");
            else
                System.out.print(lista.get(i) + ".");
        }
    }

}
