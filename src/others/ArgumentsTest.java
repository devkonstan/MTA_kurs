package others;

public class ArgumentsTest {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("arg: " + arg);
        }

        System.out.println("Ala ma " + 10 + " lat");
        System.out.println(String.format("Ala ma %h %d %s %%s lat", 11, 12, "aa") );

        System.out.println(String.format("Ala ma %d lat", 10));
    }
}
