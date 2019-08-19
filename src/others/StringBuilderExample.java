package others;

public class StringBuilderExample {

    public static void main(String[] args) {
        String s = "a";
        StringBuilder sB = new StringBuilder(s);
        for (int i = 0; i < 100; i++) {
            sB.append("a");
        }
        System.out.println(sB.toString());
    }
}

