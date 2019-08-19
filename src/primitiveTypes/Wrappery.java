package primitiveTypes;

public class Wrappery {

    public static void showInt(Integer x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 1200;
        int y = 1200;

        System.out.println(x == y);

        Integer xx = 1200;
        Integer yy = 1200;

        System.out.println("dla 1200");
        System.out.println(xx == yy); //miejsca w pamieci rozne
        System.out.println(xx.equals(yy)); //wartosci te same

        Integer xx2 = 127; //powyzej 127 przekracza zasieg
        Integer yy2 = 127;

        System.out.println("dla 127");
        System.out.println(xx2 == yy2);
        System.out.println(xx2.equals(yy2));


        showInt(23);
        showInt(new Integer(23));
    }
}
