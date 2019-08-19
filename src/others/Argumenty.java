package others;

public class Argumenty {

    public static void main(String[] argi) {
        int sum = 0;

        if (argi.length > 0) {
            for (int i = 0; i < argi.length; i++) {
                sum = sum + Integer.parseInt(argi[i]);
            }
            System.out.println(sum);
            System.out.println((float) sum/argi.length);
        }

    }
}
