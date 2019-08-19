package others;

public class Cat {
    public static final int LEGS_COUNT = 4;
    public static String DEFAULT_COLOR = "biały";

    private String name;
    private String color;

    public Cat(String name) {
        this.name = name;
        color = DEFAULT_COLOR;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Bonifacy");

        System.out.println(c1.LEGS_COUNT);
        System.out.println(Cat.LEGS_COUNT);

        System.out.println(c1.DEFAULT_COLOR);
        c1.DEFAULT_COLOR = "czarny";
        System.out.println(c1.DEFAULT_COLOR);

    }
}
