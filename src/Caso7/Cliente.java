package Caso7;

public class Cliente {

    public static void main (String[] args)
    {
        PrototypeManager.getVentanaAyuda("Ventana ayuda 1").agregarVentanaAyuda();
        PrototypeManager.getVentanaAyuda("Ventana ayuda 2").agregarVentanaAyuda();
        PrototypeManager.getVentanaAyuda("Ventana ayuda 2").agregarVentanaAyuda();
        PrototypeManager.getVentanaAyuda("Ventana ayuda 1").agregarVentanaAyuda();
    }
}
