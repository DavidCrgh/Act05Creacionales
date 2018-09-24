package Caso1;

public class CreadorCuentaOro extends FabricaCuentas {

    @Override
    public AbstractCuenta crearCuenta() {
        return new CuentaOro();
    }
}
