package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea {
    public static void main(String[] args)
            throws IOException {
        int a, b, pole;
        // klasa z aliasem br <-zmienna ref    nowy obiekt klasy ISR   obiekt System.in () to konstruktor klasy
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("podaj bok a");
        a = Integer.parseInt(br.readLine());  //readLine to metoda
        System.out.println("podaj bok b");
        b = Integer.parseInt(br.readLine());  //Integer to klasa a parseInt metoda statyczna

        pole = a * b;

        System.out.println("pole prostokata o boku " + a + " i boku b " + b + " wynosi " + pole + ".");

    }


}
