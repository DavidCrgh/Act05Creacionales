package Caso1;

public class CreadorCuentaEstandar extends FabricaCuentas {

    @Override
    public AbstractCuenta crearCuenta() {
        return new CuentaEstandar();
    }
}
