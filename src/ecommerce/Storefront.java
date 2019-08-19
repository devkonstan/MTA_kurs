package ecommerce;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront {
    private LinkedList catalog = new LinkedList(); //typ obiektowy z pakietu LinkedList; catalog to zmienna egz

    public void addItem(String id, String name, String price, String quant) {
        Item it = new Item(id, name, price, quant); //kazdy produkt to obiekt Item o zmiennej it
        catalog.add(it); //metoda add(Object->tutaj it)
    }

    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}
