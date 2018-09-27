package Caso3.Builder;

import Caso3.Producto.Coca_Cola;
import Caso3.Producto.Ham_Pollo;

public class Combo1Builder extends ComboBuilder {

    public void buildHamburguesa(){
        combo.addAlimento(new Ham_Pollo());
    }

    public void buildBebida(){
        combo.addAlimento(new Coca_Cola());
    }
}
