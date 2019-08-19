package catsAndDogs;  //jak zmienic nazwe?

public class Zwierzyniec {
    static void psy() {
        Dog pies1 = new Dog();

        pies1.name = "Burek";
        pies1.bark();
        pies1.name = "Bureczek";
        pies1.bark();

        Dog pies2 = new Dog();
        pies2.name = "Karacik";
        pies2.bark();

        System.out.println("*******");

        Dog mojPies = pies2;
        mojPies.bark();

        mojPies.name = "To mój: " + mojPies.name;
        mojPies.bark();

        pies1.bark();

        Dog piesJolki = null;
        piesJolki.bark(); // wyskoczy NullPointerException
    }


    static void koty() { //odpalic sobie debugger do tego i przesledzic
        Cat c1 = new Cat();
        c1.name = "Bonifacy";
        c1.play();

        Cat c3 = c1;
        c1.name = "Boniek";
        c1.play();
        c3.play();
    }

    static void koty2() {

        Cat c1 = new Cat();
        c1.name = "Filemon";
        c1.play();
    }

    public static void main(String[] args) {
        koty();
        System.out.println("******");
        koty2();
        System.out.println("******");
        psy();
    }
}