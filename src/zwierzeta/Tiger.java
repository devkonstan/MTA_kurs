package zwierzeta;

public class Tiger extends Cat {

    String dlugoscOgona = "60 cm";

    public void playHard() {
        say("Zabijam misjonarzy!");
    }

    public void przedstawSie() {
        System.out.println("Jestem: " + name);
    }

    public void kill() {
        say("Tiger zabija");
    }

    public String getDlugoscOgona() {
        return dlugoscOgona;
    }

}
