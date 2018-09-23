package Caso3.Producto;

import java.util.ArrayList;

public class Combo {
    private ArrayList<Alimento> items;

    public Combo() {
        items = new ArrayList<>();
    }

    public void addAlimento(Alimento alimento){
        items.add(alimento);
    }
}
