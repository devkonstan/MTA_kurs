package zwierzeta;

public class DostawcaKotow {

    String imie;

    public DostawcaKotow(String imie) {

        this.imie = imie;
    }
    // wylosuj różne zwierzeta - koty albo tygrysy
    // niech imionami będą kolejne liczby

    public Cat[] dajKoty(int ile) {
        System.out.println("Tworze koty");

        Cat[] tab = new Cat[ile];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = stworzKota();
            tab[i].name = "_" + i + " od " + imie;
        }

        return tab;
    }

    private Cat stworzKota() {
        Cat c;
        if(Math.random() > 0.5) {
            c =  new Tiger();
            c.name = "Tygrys";
        }
        else {
            c = new Cat();
            c.name = "Kot";
        }
        return c;
    }

}
