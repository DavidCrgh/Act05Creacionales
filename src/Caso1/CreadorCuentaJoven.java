package Caso1;

public class CreadorCuentaJoven extends FabricaCuentas {

    @Override
    public AbstractCuenta crearCuenta() {
        return new CuentaJoven();
    }
}
