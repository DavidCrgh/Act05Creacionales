package Caso1;

public class CuentaOro extends AbstractCuenta {

    private String targetaCredito;
    private String regalo;

    public CuentaOro() {
        setCuenta("1.5% de interés");
        setTarjetaDebido("Gratuita");
        setTargetaCredito("Gratuita - 60% pensión");
        setRegalo("Seguro");
    }

    public void setTargetaCredito(String targetaCredito) {
        this.targetaCredito = targetaCredito;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }
}
