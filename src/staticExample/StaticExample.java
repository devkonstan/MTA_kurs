package staticExample;

public class StaticExample {
    public static void main(String[] args) {

        CatForStatic c1 = new CatForStatic("Filemon");
        c1.play();

        CatForStatic.defaultColor = "czarny"; //od tej pory przeslania lokalnie defaultColor

        CatForStatic c2 = new CatForStatic("Bonifacy");
        c2.play();

        c1.play(); // tu jako najpopularniejszy pokaze sie juz "czarny"

    }
}
