package Caso3;

import Caso3.Builder.Combo1Builder;
import Caso3.Builder.DirectorCombos;
import Caso3.Producto.Combo;

public class DemoCaso3 {
    public static void main(String[] args){
        DirectorCombos directorCombos = new DirectorCombos();
        directorCombos.setBuilderCombos(new Combo1Builder());
        //Se crea un combo 1 (pollo y coca cola)
        directorCombos.construirCombo();
        Combo combo = directorCombos.getCombo();
    }
}
