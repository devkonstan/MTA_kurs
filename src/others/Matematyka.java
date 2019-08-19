package others;

import static java.lang.Math.*;


public class Matematyka {

    public static void main(String[] args) {

//        cos( six(x * 2 * pi * r) /45)
        double x = 12.8;
        double r = 122;


        double wynik = Math.cos(Math.sin(x * 2 * PI * r) / 5);


        double wynik2 = cos(sin(x * 2 * Math.PI * r) / 5);

        System.out.println(wynik);
        System.out.println(wynik2);


    }
}
