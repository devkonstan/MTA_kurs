package zwierzeta;

public class HurtownikKotowMain {

    public static void main(String[] args) {
        DostawcaKotow[] dostawcy = {
                new DostawcaKotow("Adam"), new DostawcaKotow("Andrzej")};

        HurtownikKotow hk = new HurtownikKotow();

        Cat[][] koty = hk.dajKoty(3, dostawcy);

        for (Cat[] cats : koty) {
            System.out.println("Grupa kotow");
            for (Cat cat : cats) {
                cat.playHard();
            }

        }

    }
}
