package tablice;

public class Tablice2 {

    public static void main(String[] args) {
        String[] aa = {"asd", "sdf", "fdfdfdfd"};
        int[] xxx = {33, 45, 444};

        String[] a = new String[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.toString(i * 100);
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            String el = a[i];
            a[i] = "bbb";
        }

        for(String el : a) {
            el = "aaaa"; //dostepne tylko lokalnie
            System.out.println(el);
        }

        for(String el : a) {
            System.out.println(el);

        }

    }

}
