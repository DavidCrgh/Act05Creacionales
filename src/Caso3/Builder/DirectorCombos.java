package Caso3.Builder;

import Caso3.Producto.Combo;

public class DirectorCombos {
    private ComboBuilder builderCombos;

    public void setBuilderCombos(ComboBuilder cb) {
        this.builderCombos = cb;
    }

    public Combo getCombo(){
        return builderCombos.getCombo();
    }

    public void construirCombo(){
        builderCombos.crearNuevoCombo();
        builderCombos.buildHamburguesa();
        builderCombos.buildBebida();
    }
}
