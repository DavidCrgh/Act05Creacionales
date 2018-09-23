package Caso3.Builder;

import Caso3.Producto.Combo;

public abstract class ComboBuilder {
    protected Combo combo;

    public abstract void buildHamburguesa();
    public abstract void buildBebida();

    public void crearNuevoCombo(){
        this.combo = new Combo();
    }

    public Combo getCombo(){
        return this.combo;
    }
}
