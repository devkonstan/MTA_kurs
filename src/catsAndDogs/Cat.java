package catsAndDogs;

public class Cat {
    public String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        born();
    }

    public Cat() {
        this.name = "some name";
        born();
    }

    public Cat(String name) {
        if (Math.random() > 0.5) {
            this.name = "with name";
        } else {
            this.name = "no name";
        }
        born();
    }

    void born() {

        say("rodzę się");

    }

    void say(String what) {

        System.out.println(this.name + ": - " + what);

    }

    void play() {

        say("bawię się");

    }
}
