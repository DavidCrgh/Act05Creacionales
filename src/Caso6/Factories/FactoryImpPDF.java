package Caso6.Factories;

import Caso6.Productos.Impresora;
import Caso6.Productos.ImpresoraPDF;

public class FactoryImpPDF extends FactoryImpresora{

    public Impresora crearImpresora(String tipoArchivo){
        return new ImpresoraPDF();
    }
}
