package com.mm.animals;

public class Smok {
    private String imie;
    private double pojemnosc;
    private boolean ognien;

    private boolean adult;

    public Smok(String imie, double pojemnosc) {
        this.imie = imie;
        this.pojemnosc = pojemnosc;
    }

    public Smok(String imie, double pojemnosc, boolean ognien) {
        this.imie = imie;
        this.pojemnosc = pojemnosc;
        this.ognien = ognien;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public boolean isOgnien() {
        return ognien;
    }

    public void setOgnien(boolean ognien) {
        this.ognien = ognien;
    }

    public boolean isAdult() {
        return adult;
    }
}
