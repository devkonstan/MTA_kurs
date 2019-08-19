package zwierzeta;

public class RzutowanieMain {

    private static void showAnimal(Animal a) {
        System.out.println("Oto zwierze: " + a.name);
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal c = new Cat();

        Tiger t = new Tiger();

        Cat c2 = (Cat) t;

        showAnimal(c2);

        Animal c3 = new Dog();
        Cat c5 = (Cat) c3; //c3 to Dog a przerobione.Cat jest w hierarchii na tym samym poziomie

    }
}
