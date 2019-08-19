package strings;

public class BuilderMain {

    void changeMe(String str) {
        str = "[" + str + "]";
        System.out.println("changeMe: " + str);
    }

    void changeMe(StringBuilder str) {
        str.insert(0, "{"); //wstawia w indeksie 0 "{"
        str.append("}"); //wstawia na koncu "}"
        System.out.println("changeMe: " + str); //wyswietla calosc
    }

    public void changeIt() {
        String s1 = "text";
        changeMe(s1); //najpierw wywola to przekazujac jako arg s1=text
        System.out.println("changeIt: " + s1); //a potem dopiero to
    }

    public void changeIt2() {
        StringBuilder s2 = new StringBuilder("text"); //utworzenie noewgo obiektu wbudowanej klasy StringBuilder
        changeMe(s2); //wywolanie metody changeMe
        System.out.println("changeIt: " + s2); //s2 trwale zmienione -> dodane {}
    }

    public static void main(String[] args) {
        BuilderMain builderMain = new BuilderMain();
        builderMain.changeIt();
        builderMain.changeIt2();
    }


}
