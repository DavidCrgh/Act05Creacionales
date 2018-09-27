package Caso4;

public class FactoryPattern {

    public static void main(String[] args) {
        PiezaFactory piezaFactory = new PiezaFactory();

        Pieza pieza1 = piezaFactory.obtenerPieza("Ele");
        pieza1.dibujarPieza();

        Pieza pieza2 = piezaFactory.obtenerPieza("Linea");
        pieza2.dibujarPieza();

        Pieza pieza3 = piezaFactory.obtenerPieza("T");
        pieza3.dibujarPieza();

        Pieza pieza4 = piezaFactory.obtenerPieza("Cuadrado");
        pieza4.dibujarPieza();
    }
}
