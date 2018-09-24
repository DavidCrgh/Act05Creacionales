package Caso1;

public class CuentaJoven extends AbstractCuenta {

    private String regalo;

    public CuentaJoven() {
        setCuenta("2% de interés");
        setTarjetaDebido("Gratuita");
        setRegalo("CD música");
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
}
