package others;

class B {
    static int value = 20;
    int nonstatic = 10; //zmienna moze byc dowolnie zmieniona
}

public class StaticNonStaticExample {
    public static void main(String[] args) {
        System.out.println(B.value);
        B b1 = new B();
        B b2 = new B();

        b2.value = 30; //odwolujemy sie do value poprzez obiekt b2, ale ze jest static to dotyczy wszystkich z klasy przerobione.B
        b1.nonstatic = 100;
        System.out.println(b1.value + b1.nonstatic); //30+100
        System.out.println(b2.value + b2.nonstatic); //30+10
        //value jest polem statycznym wiec dotyczy wszystkich obiektow klasy przerobione.B
        //nonstatic dla b1 jest inny niz ogolny nonstatic
        System.out.println(B.value); //30
        b2.value = 40; //odwolanie do pola poprzez obiekt
        b2.nonstatic = 200;
        System.out.println(b1.value + b1.nonstatic); //40+100
        System.out.println(b2.value + b2.nonstatic); //40+200
        System.out.println(B.value); //zmienia na 40
    }

}
