package strings;

public class StringsMain {
    public static void main(String[] args) {
        String s1 = "Aleksandra z Mozambiku";
        String s2 = "Aleksandra ";

        s2 = s2 + "z Mozambiku";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String x = "a";
        for (int i = 0; i < 100; i++) {
            x = x + i + "_";
        }

        System.out.println(x);


        StringBuilder xx = new StringBuilder("a");
        for (int i = 0; i < 10000; i++) {
            xx.append(i + "_");
        }

        System.out.println(xx);




    }
}
