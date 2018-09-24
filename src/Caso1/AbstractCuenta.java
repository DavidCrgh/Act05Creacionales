package Caso1;

public abstract class AbstractCuenta {

    private String cuenta;
    private String tarjetaDebido;

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setTarjetaDebido(String tarjetaDebido) {
        this.tarjetaDebido = tarjetaDebido;
    }
}
