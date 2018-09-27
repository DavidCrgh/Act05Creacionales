package Caso6.Factories;

import Caso6.Productos.Impresora;
import Caso6.Productos.ImpresoraWord;

public class FactoryImpWord {

    public Impresora crearImpresora(String tipoArchivo){
        return new ImpresoraWord();
    }
}
