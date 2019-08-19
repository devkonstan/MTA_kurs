package aaa.Ja;

public class Konrad {
    private String private1; //dostepne tylko tutaj
    String default1;
    protected String protected1;
    public String public1; //dostepne takze poza pakietem

    public static void main(String[] args) {
        Konrad konrad=new Konrad();
        konrad.private1="osoba";
        konrad.default1 ="Stankiewicz";
        konrad.protected1 ="60kg";
        konrad.public1 ="student";

    }


}
