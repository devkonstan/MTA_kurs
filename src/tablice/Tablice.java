package tablice;

public class Tablice {

    public static void main(String[] args) {
        String[] a;
        a = new String[5];

        System.out.println(a[2]);
        a[0] = "jeden";
        a[1] = "dwa";
        a[2] = "trzy";
        a[3] = "cztery";
        a[4] = "pięć";

        System.out.println(a[2]);

        System.out.println(a.length);

        System.out.println("*************************");


        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " = " + a[i]);
        }

        System.out.println("*************************");

        int j = 1;
        for(String el : a) {
            System.out.println( j++ + " = " + el);
        }


    }

}
