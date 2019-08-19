package ecommerce;

import static java.lang.Math.PI;

//klasa Item jest pomocnicza
public class Item implements Comparable { //interfejs o nazwie Comparable (ulatwia sortowanie obiektow), ktory musi zawierac metode compareTo
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    double value = PI;

    //poniewaz wszystkie sa prywatne, to zadna inna klasa nie moze ustawic/pobrac ich wartosci
    Item(String idIn, String nameIn, String retailIn, String qIn) { //obiektowe argumenty konstruktora klasy
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn); //metoda klasowa zamienia String na Double
        quantity = Integer.parseInt(qIn); //analogicznie jak wyzej

        if (quantity > 400)
            price = retail * .5D;
        else if (quantity > 200)
            price = retail * .6D;
        else
            price = retail * .7D;

        price = Math.floor(price * 100 + .5) / 100;
    }

    //sortuje od najwyzszej do najnizszej ceny
    public int compareTo(Object obj) { //abstrakcyjna metoda
        Item temp = (Item) obj; //rzutowanie
        if (this.price < temp.price) {
            return 1;
        } else if (this.price > temp.price) {
            return -1; //znajdzie sie na szczycie listy
        }
        return 0;
    }

    //metody dostepowe zapewaniajace pobieranie wartosci przez inne klasy
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
