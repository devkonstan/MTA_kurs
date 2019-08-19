package animals;

public class Cat {
    public String name;
    String color;

    private static final String DOMYSLNE_IMIE = "NO_NAME";
    private static final String DOMYSLNY_KOLOR = "czarny";
    public static final int LICZBA_NOG = 4;

    public static final double PI = 3.14;

    public static int ileKotow = 0;

    public Cat() {
        this(DOMYSLNE_IMIE);
    }

    public Cat(String name) {
        this(name, DOMYSLNY_KOLOR);
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        born();
    }

    private void born() {
        say("rodzę się! jestem: " + color);
        ileKotow++;
    }

    private void say(String what) {
        System.out.println(name + ": - " + what);
    }

    public void play() {
        say("bawię się!");
    }

    private static int policzNogi(int ileSztuk) {
        return ileSztuk * LICZBA_NOG;
    }

    public static int ileMamyNog() {
        return policzNogi(ileKotow);
    }

}
