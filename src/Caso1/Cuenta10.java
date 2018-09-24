package Caso1;

public class Cuenta10 extends AbstractCuenta {

    private String tarjetaCredito;
    private String regalo;

    public Cuenta10() {
        setCuenta("1% de interés - 50% descubierto");
        setTarjetaDebido("Gratuita");
        setTarjetaCredito("18 euros - 60% nómina");
        setRegalo("Reporductor - CD");
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
}
