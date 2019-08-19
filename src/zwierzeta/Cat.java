package zwierzeta;

public class Cat extends Animal {

    String dlugoscOgona = "5 cm";

    /**
     * Zabawa kota
     */
    public void play() {
        say("bawię się włóczką!");
    }

    public void playHard() {
        say("zabijam myszy");
    }

    public String getDlugoscOgona() {
        return dlugoscOgona;
    }
}
