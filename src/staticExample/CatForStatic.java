package staticExample;

public class CatForStatic {
    public static final int LEGS_COUNT = 4;
    public static String defaultColor = "biały";

    public String name;
    private String color;

    public CatForStatic(String name) {
        this.name = name;
        color = defaultColor;
    }

    public void play () {
        System.out.println("Bawię się: " + name + " i jestem: " + color);
        System.out.println("obecnie najpopularniejszy kolor nowych kotów to " + defaultColor);
    }
}
