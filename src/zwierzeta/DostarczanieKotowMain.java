package zwierzeta;

public class DostarczanieKotowMain {
    public static void main(String[] args) {
        DostawcaKotow dostawca1  = new DostawcaKotow("Adam");

        Cat[] koty = dostawca1.dajKoty(5);

        for (Cat cat : koty) {
            cat.play();
            cat.playHard();

            System.out.println(cat.getClass().getName());

            if (cat instanceof Tiger) {
                Tiger t1 = (Tiger) cat;
                t1.kill();
            }



        }

    }

}
