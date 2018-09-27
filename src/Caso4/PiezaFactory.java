package Caso4;

public class PiezaFactory {

    public Pieza obtenerPieza(String tipo){
        if(tipo == null){
            return null;
        }
        if(tipo.equalsIgnoreCase("Ele")){
            return new Ele();

        } else if(tipo.equalsIgnoreCase("Linea")){
            return new Linea();

        } else if(tipo.equalsIgnoreCase("T")){
            return new T();

        }else if(tipo.equalsIgnoreCase("Cuadrado")){
            return new Cuadrado();
        }

        return null;
    }
}
