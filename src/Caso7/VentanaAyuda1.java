package Caso7;

public class VentanaAyuda1 extends PrototypeVentana {

    public VentanaAyuda1() {
        this.nombreVentanaAyuda = "Ventana ayuda 1";
    }

    @Override
    void agregarVentanaAyuda()
    {
        System.out.println("La ventana 1 ha sido añadida");
    }
}
