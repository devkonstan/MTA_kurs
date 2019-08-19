package zwierzeta;

public class DziedziczenieMain {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Bonifacy";

        c1.play();
        c1.playHard();
        System.out.println("Dlugosc " + c1.dlugoscOgona);
        System.out.println("Dlugosc jako getter " + c1.getDlugoscOgona());

        System.out.println("****************");

        Tiger t1 = new Tiger();
        t1.name = "Kicia";
        t1.play();
        t1.playHard();
        t1.kill();
        t1.przedstawSie();
        System.out.println("Dlugosc " + t1.dlugoscOgona);
        System.out.println("Dlugosc jako getter " + t1.getDlugoscOgona());

        System.out.println("****************");

        Cat c2 = new Tiger();
        c2.name = "Tygrys przedstawiony jako kot";
        c2.play();
        c2.playHard();

        System.out.println("Dlugosc " + c2.dlugoscOgona); // pola dziedziczone sa po pilocie (z lewej)
        System.out.println("Dlugosc jako getter " + c2.getDlugoscOgona()); //metody dziedziczone sa po klasie (z prawej)

    }
}
