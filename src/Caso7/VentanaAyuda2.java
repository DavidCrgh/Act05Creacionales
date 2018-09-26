package Caso7;

public class VentanaAyuda2 extends PrototypeVentana {

    public VentanaAyuda2() {
        this.nombreVentanaAyuda = "Ventana ayuda 2";
    }

    @Override
    void agregarVentanaAyuda()
    {
        System.out.println("La ventana 2 ha sido añadida");
    }
}
