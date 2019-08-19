package animals;

public class Zwierzyniec {

    static void psy() {
        Dog pies1 = new Dog();
        pies1.name = "Burek";
        pies1.bark();
        pies1.name = "Bureczek";
        pies1.bark();

        Dog pies2 = new Dog();
        pies2.name = "Kajtek";
        pies2.bark();

        System.out.println("*************");

        Dog mojPies = pies1; // Bureczek
        mojPies.bark();

        System.out.println("mojPies szczeka");
        mojPies.name = "To mój: " + mojPies.name;
        mojPies.bark();

        System.out.println("pies1 szczeka");
        pies1.bark();

        System.out.println("*************");
        pies1 = null;
        mojPies.bark();
    }

    static void koty() {
        Cat c1 = new Cat("Bonifacy");
        c1.play();

        Cat c3 = c1;
        c1.name = "Boniek";
        c1.play();
        c3.play();
    }

    static void koty2() {
        Cat c1 = new Cat("Filemon");
        c1.play();

        Cat c2 = new Cat("Bonifacy", "biały");
        c2.play();

    }

    public static void main(String[] args) {
        psy();
        koty();
        System.out.println("********");
        koty2();
    }
}
