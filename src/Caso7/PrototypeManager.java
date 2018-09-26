package Caso7;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private static Map<String, PrototypeVentana> ventanaAyudaMap = new HashMap<String, PrototypeVentana>();

    static
    {
        ventanaAyudaMap.put("Ventana ayuda 1", new VentanaAyuda1());
        ventanaAyudaMap.put("Ventana ayuda 2", new VentanaAyuda2());
    }

    public static PrototypeVentana getVentanaAyuda(String nombreVentanaAyuda)
    {
        return (PrototypeVentana) ventanaAyudaMap.get(nombreVentanaAyuda).clone();
    }
}
