package Caso6.Factories;

import Caso6.Productos.Impresora;

public abstract class FactoryImpresora {
    public abstract Impresora crearImpresora(String tipoArchivo);
}
