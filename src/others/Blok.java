package others;

public class Blok {

    int value = 10;

    public Blok(int value) {
        System.out.println("konstruktor");
        this.value = value;
    }

    public static void main(String[] args) {
        Blok b = new Blok(25);
        System.out.println(b.value);
    }

    {   //wyswietli sie przed wszystkimi
        System.out.println("inicjalizacja");
        this.value = 15;
    }

}
