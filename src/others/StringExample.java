package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExample {
    public static void main(String[] args)
            throws IOException {
        String imię, nazwisko;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("program mierzy dlugosc imienia i nazwiska");
        System.out.println("podaj imie");
        imię = br.readLine();
        System.out.println("podaj nazwisko");
        nazwisko = br.readLine();
        System.out.println("imię zawiera" + imię.length() + " liter(y)");
        System.out.println("nazwisko zawiera" + nazwisko.length() + " liter(y)");
    }
}


