package Caso7;

public abstract class PrototypeVentana implements Cloneable {

    protected String nombreVentanaAyuda;

    abstract void agregarVentanaAyuda();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

}
